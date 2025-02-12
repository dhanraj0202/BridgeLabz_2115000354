class Item{
    String name;
    int id, quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price){
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory{
    Item head;

    void addAtBeginning(String name, int id, int quantity, double price){
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    void addAtEnd(String name, int id, int quantity, double price){
        Item newItem = new Item(name, id, quantity, price);
        if(head == null){
            head = newItem;
            return;
        }
        Item temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newItem;
    }

    void addAtPosition(String name, int id, int quantity, double price, int position){
        if(position <= 0 || head == null){
            addAtBeginning(name, id, quantity, price);
            return;
        }
        Item newItem = new Item(name, id, quantity, price);
        Item temp = head;
        for(int i = 1; temp.next != null && i < position; i++){
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    void removeById(int id){
        if(head == null){
			return;
		}
        if(head.id == id){
            head = head.next;
            return;
        }
        Item temp = head;
        while(temp.next != null && temp.next.id != id){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
    }

    void updateQuantity(int id, int newQuantity){
        Item temp = head;
        while(temp != null){
            if(temp.id == id){
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id){
        Item temp = head;
        while(temp != null){
            if(temp.id == id){
                System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    void searchByName(String name){
        Item temp = head;
        boolean found = false;
        while(temp != null){
            if(temp.name.equalsIgnoreCase(name)){
                System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if(!found){
			System.out.println("Item with name " + name + " not found.");
		}
    }

    double calculateTotalInventoryValue(){
        double totalValue = 0;
        Item temp = head;
        while(temp != null){
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    void displayInventory(){
        Item temp = head;
        while(temp != null){
            System.out.println("Item: " + temp.name + ", ID: " + temp.id + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    Item mergeSort(Item head, boolean sortByName, boolean ascending){
        if(head == null || head.next == null){
			return head;
		}
        Item mid = getMiddle(head);
        Item nextToMid = mid.next;
        mid.next = null;
        Item left = mergeSort(head, sortByName, ascending);
        Item right = mergeSort(nextToMid, sortByName, ascending);
        return merge(left, right, sortByName, ascending);
    }

    Item merge(Item left, Item right, boolean sortByName, boolean ascending){
        if(left == null){
			return right;
		}
        if(right == null){
			return left;
		}
        boolean condition;
        if(sortByName){
            condition = left.name.compareToIgnoreCase(right.name) < 0;
        }
		else{
            condition = left.price < right.price;
        }
        if(!ascending){
			condition = !condition;
		}
        if(condition){
            left.next = merge(left.next, right, sortByName, ascending);
            return left;
        }
		else{
            right.next = merge(left, right.next, sortByName, ascending);
            return right;
        }
    }

    Item getMiddle(Item head){
        if (head == null) return head;
        Item slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void sortInventory(boolean sortByName, boolean ascending){
        head = mergeSort(head, sortByName, ascending);
    }
}

public class InventoryManagementSystem{
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        inventory.addAtEnd("Laptop", 101, 10, 1500.00);
        inventory.addAtEnd("Mouse", 102, 50, 25.00);
        inventory.addAtBeginning("Keyboard", 103, 30, 45.00);
        inventory.addAtPosition("Monitor", 104, 15, 300.00, 2);

        System.out.println("Inventory List:");
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalInventoryValue());

        System.out.println("\nSearching for Item ID 102:");
        inventory.searchById(102);

        System.out.println("\nUpdating Quantity of Item ID 103:");
        inventory.updateQuantity(103, 40);
        inventory.displayInventory();

        System.out.println("\nSorting Inventory by Name (Ascending):");
        inventory.sortInventory(true, true);
        inventory.displayInventory();

        System.out.println("\nSorting Inventory by Price (Descending):");
        inventory.sortInventory(false, false);
        inventory.displayInventory();

        System.out.println("\nRemoving Item ID 104:");
        inventory.removeById(104);
        inventory.displayInventory();
    }
}

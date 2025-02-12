import java.util.*;

class User{
    int userId, age;
    String name;
    Set<Integer> friends;
    User next;

    User(int userId, String name, int age){
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new HashSet<>();
        this.next = null;
    }
}

class SocialMedia{
    User head = null;

    void addUser(int userId, String name, int age){
        User newUser = new User(userId, name, age);
        if(head == null){
            head = newUser;
        }
		else{
            User temp = head;
            while(temp.next != null){
				temp = temp.next;
			}
            temp.next = newUser;
        }
    }

    User getUser(int userId){
        User temp = head;
        while(temp != null){
            if(temp.userId == userId){
				return temp;
			}
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int userId1, int userId2){
        User user1 = getUser(userId1);
        User user2 = getUser(userId2);
        if(user1 != null && user2 != null && userId1 != userId2){
            user1.friends.add(userId2);
            user2.friends.add(userId1);
        }
    }

    void removeFriend(int userId1, int userId2){
        User user1 = getUser(userId1);
        User user2 = getUser(userId2);
        if(user1 != null && user2 != null){
            user1.friends.remove(userId2);
            user2.friends.remove(userId1);
        }
    }

    Set<Integer> findMutualFriends(int userId1, int userId2){
        User user1 = getUser(userId1);
        User user2 = getUser(userId2);
        if(user1 != null && user2 != null){
            Set<Integer> mutualFriends = new HashSet<>(user1.friends);
            mutualFriends.retainAll(user2.friends);
            return mutualFriends;
        }
        return Collections.emptySet();
    }

    void displayFriends(int userId){
        User user = getUser(userId);
        if(user != null){
            System.out.print("Friends of " + user.name + ": ");
            for(int friendId : user.friends){
                User friend = getUser(friendId);
                if(friend != null){
					System.out.print(friend.name + " ");
				}
            }
            System.out.println();
        }
    }

    void searchUser(String name){
        User temp = head;
        while(temp != null){
            if(temp.name.equalsIgnoreCase(name)){
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    void searchUser(int userId){
        User user = getUser(userId);
        if(user != null){
            System.out.println("User Found: " + user.name + " (ID: " + user.userId + ")");
        }
		else{
            System.out.println("User not found.");
        }
    }

    void countFriends(){
        User temp = head;
        while(temp != null){
            System.out.println(temp.name + " has " + temp.friends.size() + " friends.");
            temp = temp.next;
        }
    }
}

public class SocialMediaFriend{
    public static void main(String[] args){
        SocialMedia app = new SocialMedia();

        app.addUser(1, "Dhanraj", 25);
        app.addUser(2, "Nikhil", 27);
        app.addUser(3, "Aman", 24);
        app.addUser(4, "Lokesh", 26);

        app.addFriend(1, 2);
        app.addFriend(1, 3);
        app.addFriend(2, 3);
        app.addFriend(3, 4);

        app.displayFriends(1);
        app.displayFriends(3);

        System.out.println("Mutual friends of Dhanraj and Nikhil: " + app.findMutualFriends(1, 2));

        app.searchUser("Aman");
        app.searchUser(4);

        app.countFriends();

        app.removeFriend(1, 2);
        app.displayFriends(1);
    }
}

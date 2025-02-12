import java.util.Date;

class Task{
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate){
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CircularTaskScheduler{
    Task head, tail;
    Task currentTask;

    void addAtBeginning(int taskId, String taskName, int priority, String dueDate){
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = tail = newTask;
            newTask.next = head;
        }
		else{
            newTask.next = head;
            tail.next = newTask;
            head = newTask;
        }
        currentTask = head;
    }

    void addAtEnd(int taskId, String taskName, int priority, String dueDate){
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = tail = newTask;
            newTask.next = head;
        }
		else{
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position){
        if(position <= 0 || head == null){
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for(int i = 1; temp.next != head && i < position; i++){
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if(temp == tail){
            tail = newTask;
        }
    }

    void removeByTaskId(int taskId){
        if(head == null){
			return;
		}
        if(head.taskId == taskId){
            if(head == tail){
                head = tail = null;
                return;
            }
            tail.next = head.next;
            head = head.next;
            currentTask = head;
            return;
        }
        Task temp = head;
        while(temp.next != head && temp.next.taskId != taskId){
            temp = temp.next;
        }
        if(temp.next.taskId == taskId){
            if(temp.next == tail){
                tail = temp;
            }
            temp.next = temp.next.next;
        }
    }

    void viewCurrentTask(){
        if(currentTask != null){
            System.out.println("Current Task: " + currentTask.taskName + " (ID: " + currentTask.taskId + ")");
        }
    }

    void moveToNextTask(){
        if(currentTask != null){
            currentTask = currentTask.next;
            viewCurrentTask();
        }
    }

    void displayTasks(){
        if(head == null){
			return;
		}
        Task temp = head;
        do{
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        }while(temp != head);
    }

    void searchByPriority(int priority){
        if(head == null){
			return;
		}
        Task temp = head;
        boolean found = false;
        do{
            if(temp.priority == priority){
                System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        }while(temp != head);
        if(!found){
			System.out.println("No tasks found with priority: " + priority);
		}
    }
}

public class TaskScheduler{
    public static void main(String[] args){
        CircularTaskScheduler scheduler = new CircularTaskScheduler();

        scheduler.addAtEnd(101, "Task A", 1, "2025-02-15");
        scheduler.addAtEnd(102, "Task B", 2, "2025-02-16");
        scheduler.addAtBeginning(100, "Task C", 1, "2025-02-14");
        scheduler.addAtPosition(103, "Task D", 3, "2025-02-17", 2);

        System.out.println("Task List:");
        scheduler.displayTasks();

        System.out.println("\nCurrent Task:");
        scheduler.viewCurrentTask();

        System.out.println("\nMoving to Next Task:");
        scheduler.moveToNextTask();
        scheduler.moveToNextTask();

        System.out.println("\nSearching for Tasks with Priority 1:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(102);

        System.out.println("\nTask List after Removal:");
        scheduler.displayTasks();
    }
}

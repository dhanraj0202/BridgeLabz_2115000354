class Process{
    int processId, burstTime, remainingTime;
    Process next;

    Process(int processId, int burstTime){
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class RoundRobinScheduler{
    Process head = null, tail = null;
    int timeQuantum;

    RoundRobinScheduler(int timeQuantum){
        this.timeQuantum = timeQuantum;
    }

    void addProcess(int processId, int burstTime){
        Process newProcess = new Process(processId, burstTime);
        if(head == null){
            head = tail = newProcess;
            tail.next = head;
        }
		else{
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    void executeProcesses(){
        if(head == null){
			return;
		}

        int time = 0, processCount = 0, totalWaitingTime = 0, totalTurnaroundTime = 0;
        Process current = head;

        while(true){
            boolean allCompleted = true;
            do{
                if(current.remainingTime > 0){
                    allCompleted = false;
                    int executionTime = Math.min(timeQuantum, current.remainingTime);
                    time += executionTime;
                    current.remainingTime -= executionTime;

                    if(current.remainingTime == 0){
                        int turnaroundTime = time;
                        int waitingTime = turnaroundTime - current.burstTime;
                        totalTurnaroundTime += turnaroundTime;
                        totalWaitingTime += waitingTime;
                        processCount++;
                        removeProcess(current.processId);
                    }
                }
                current = current.next;
            }while(current != head);

            displayProcesses();
            if(allCompleted){
				break;
			}
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / processCount);
    }

    void removeProcess(int processId){
        if(head == null){
			return;
		}
        Process current = head, prev = null;

        do{
            if(current.processId == processId){
                if(current == head && current == tail){
                    head = tail = null;
                }
				else if(current == head){
                    tail.next = head.next;
                    head = head.next;
                }
				else if(current == tail){
                    prev.next = head;
                    tail = prev;
                }
				else{
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }while(current != head);
    }

    void displayProcesses(){
        if(head == null){
            System.out.println("\nNo remaining processes.");
            return;
        }
        Process temp = head;
        System.out.print("\nCurrent Process Queue: ");
        do{
            System.out.print("[P" + temp.processId + " (Remaining: " + temp.remainingTime + ")] -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("(Back to Head)");
    }
}

public class RoundRobin{
    public static void main(String[] args){
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);
        scheduler.addProcess(4, 6);

        System.out.println("Starting Round Robin Scheduling...");
        scheduler.executeProcesses();
    }
}

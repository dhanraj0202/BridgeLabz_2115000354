import java.util.LinkedList;
import java.util.Queue;

public class CircularTourProblem{
    public static int findStartingPoint(int[] petrol, int[] distance){
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();
        int totalSurplus = 0, currentSurplus = 0, start = 0;

        for(int i = 0; i < n; i++){
            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currentSurplus += balance;
            queue.offer(i);

            if(currentSurplus < 0){
                while(!queue.isEmpty()){
                    queue.poll();
                }
                start = i + 1;
                currentSurplus = 0;
            }
        }
        return (totalSurplus >= 0) ? start : -1;
    }

    public static void main(String[] args){
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println(startIndex == -1 ? "No solution" : "Start at pump " + startIndex);
    }
}

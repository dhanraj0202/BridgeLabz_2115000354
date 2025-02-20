import java.util.*;

public class VotingSystem{
	private Map<String, Integer> voteMap = new HashMap<>();
	private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

	public void castVote(String candidate){
		voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
		voteOrder.put(candidate, voteMap.get(candidate));
	}

	public void displayResultsSorted(){
		TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);
		System.out.println("Sorted Results: " + sortedResults);
	}

	public void displayVoteOrder(){
		System.out.println("Vote Order: " + voteOrder);
	}

	public static void main(String[] args){
		VotingSystem votingSystem = new VotingSystem();
		votingSystem.castVote("Dhanraj");
		votingSystem.castVote("Nakul");
		votingSystem.castVote("Dhanraj");
		votingSystem.castVote("Chirag");
		votingSystem.castVote("Nakul");

		votingSystem.displayResultsSorted(); 
		votingSystem.displayVoteOrder();
	}
}
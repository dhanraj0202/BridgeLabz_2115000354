import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy>{
	private String policyNumber;
	private String policyholderName;
	private Date expiryDate;
	private String coverageType;
	private double premiumAmount;

	public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount){
		this.policyNumber = policyNumber;
		this.policyholderName = policyholderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}

	public String getPolicyNumber(){
		return policyNumber;
	}

	public Date getExpiryDate(){
		return expiryDate;
	}

	public String getCoverageType(){
		return coverageType;
	}

	@Override
	public int compareTo(InsurancePolicy other){
		return this.expiryDate.compareTo(other.expiryDate);
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof InsurancePolicy)){
			return false;
		}
		InsurancePolicy policy = (InsurancePolicy) obj;
		return policyNumber.equals(policy.policyNumber);
	}

	@Override
	public int hashCode(){
		return Objects.hash(policyNumber);
	}

	@Override
	public String toString(){
		return "PolicyNumber: " + policyNumber + ", Holder: " + policyholderName +
				", Expiry: " + expiryDate + ", Type: " + coverageType + ", Premium: " + premiumAmount;
	}
}

public class InsurancePolicyManagementSystem{
	private Set<InsurancePolicy> hashSet = new HashSet<>();
	private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
	private Set<InsurancePolicy> treeSet = new TreeSet<>();

	public void addPolicy(InsurancePolicy policy){
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}

	public void displayAllPolicies(){
		System.out.println("All Policies (HashSet): " + hashSet);
		System.out.println("All Policies (LinkedHashSet - Maintains Order): " + linkedHashSet);
		System.out.println("All Policies (TreeSet - Sorted by Expiry Date): " + treeSet);
	}

	public void displayExpiringSoon(){
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 30);
		Date thresholdDate = calendar.getTime();

		System.out.println("Policies Expiring Within 30 Days:");
		for(InsurancePolicy policy : treeSet){
			if(policy.getExpiryDate().before(thresholdDate) && policy.getExpiryDate().after(currentDate)){
				System.out.println(policy);
			}
		}
	}

	public void displayByCoverageType(String coverageType){
		System.out.println("Policies with Coverage Type: " + coverageType);
		for(InsurancePolicy policy : hashSet){
			if(policy.getCoverageType().equalsIgnoreCase(coverageType)){
				System.out.println(policy);
			}
		}
	}

	public void displayDuplicatePolicies(){
		Set<String> seenPolicyNumbers = new HashSet<>();
		Set<InsurancePolicy> duplicates = new HashSet<>();

		for(InsurancePolicy policy : hashSet){
			if(!seenPolicyNumbers.add(policy.getPolicyNumber())){
				duplicates.add(policy);
			}
		}

		System.out.println("Duplicate Policies: " + duplicates);
	}

	public void performanceComparison(){
		int numPolicies = 100000;
		List<InsurancePolicy> policies = new ArrayList<>();
		Random random = new Random();

		for(int i = 0; i < numPolicies; i++){
			policies.add(new InsurancePolicy(
				"P" + i,
				"Holder" + i,
				new Date(System.currentTimeMillis() + random.nextInt(1000000000)),
				"Type" + (i % 3),
				random.nextDouble() * 1000
			));
		}

		long start, end;

		start = System.nanoTime();
		Set<InsurancePolicy> hashSetTest = new HashSet<>(policies);
		end = System.nanoTime();
		System.out.println("HashSet Add Time: " + (end - start) + " ns");

		start = System.nanoTime();
		Set<InsurancePolicy> linkedHashSetTest = new LinkedHashSet<>(policies);
		end = System.nanoTime();
		System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

		start = System.nanoTime();
		Set<InsurancePolicy> treeSetTest = new TreeSet<>(policies);
		end = System.nanoTime();
		System.out.println("TreeSet Add Time: " + (end - start) + " ns");
	}

	public static void main(String[] args){
		InsurancePolicyManagementSystem manager = new InsurancePolicyManagementSystem();

		manager.addPolicy(new InsurancePolicy("P101", "Dhanraj", new Date(System.currentTimeMillis() + 100000000), "Health", 500.0));
		manager.addPolicy(new InsurancePolicy("P102", "Aryan", new Date(System.currentTimeMillis() + 500000000), "Auto", 700.0));
		manager.addPolicy(new InsurancePolicy("P103", "Nikhil", new Date(System.currentTimeMillis() + 250000000), "Home", 900.0));
		manager.addPolicy(new InsurancePolicy("P101", "Aman", new Date(System.currentTimeMillis() + 100000000), "Health", 500.0));

		manager.displayAllPolicies();
		manager.displayExpiringSoon();
		manager.displayByCoverageType("Health");
		manager.displayDuplicatePolicies();
		manager.performanceComparison();
	}
}
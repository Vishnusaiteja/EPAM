package BehaviouralPatterns.StrategyPattern.ObserverDesignPattern;

public class CurrentScore {
	int runs,wickets;
	float overs;
	public void update(int runs, int wickets, float overs) {
		this.runs=runs;
		this.overs=overs;
		this.wickets=wickets;
		System.out.println("Current Score:");
		System.out.println("Current runs:"+runs);
		System.out.println("Current overs:"+overs);
		System.out.println("Current wickets:"+wickets);
	}

}

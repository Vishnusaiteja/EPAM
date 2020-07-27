package BehaviouralPatterns.StrategyPattern.ObserverDesignPattern;

public class AverageScore {
	float runRate;
	int predictedScore;
	public void update(int runs, int wickets, float overs) {
		this.runRate=(float)runs/overs;
		this.predictedScore=(int)(this.runRate*50);
		System.out.println("Average Score:");
		System.out.println("Average Run Rate:"+runRate);
		System.out.println("Predictable score:"+predictedScore);
	}

}

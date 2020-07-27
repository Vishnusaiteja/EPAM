package BehaviouralPatterns.StrategyPattern.ObserverDesignPattern;

public class CricketData {
	int runs,wickets;
	float overs;
	CurrentScore currentScore;
	AverageScore averageScore;
	public CricketData(CurrentScore currentScore,AverageScore averageScore) {
		this.currentScore=currentScore;
		this.averageScore=averageScore;
	}
	int getLatestRuns() {
		return 50;
	}
	int getLatestWickets() {
		return 3;
	}
	float getLatestOvers() {
		return (float)5.5;
	}
	public void dataChanged() {
		runs=getLatestRuns();
		wickets=getLatestWickets();
		overs=getLatestOvers();
		currentScore.update(runs,wickets,overs);
		averageScore.update(runs,wickets,overs);
	}
}

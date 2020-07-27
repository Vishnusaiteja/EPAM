package BehaviouralPatterns.StrategyPattern.ObserverDesignPattern;

public class ObserverDesignPatternDemo {

	public static void main(String[] args) {
		AverageScore averageScore=new AverageScore();
		CurrentScore currentScore=new CurrentScore();
		CricketData cricketData=new CricketData(currentScore, averageScore);
		cricketData.dataChanged();
	}

}

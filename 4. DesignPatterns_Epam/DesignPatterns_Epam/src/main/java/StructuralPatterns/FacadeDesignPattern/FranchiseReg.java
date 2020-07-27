package StructuralPatterns.FacadeDesignPattern;

public class FranchiseReg {
	private Franchise KFC;
	private Franchise MCDonalds;
	public FranchiseReg() {
		KFC=new KFC();
		MCDonalds=new MCDonalds();
	}
	public void buyKFCFranchise() {
		KFC.option();
		KFC.cost();
	}
	public void buyMcDonalds() {
		MCDonalds.option();
		MCDonalds.cost();
	}
}

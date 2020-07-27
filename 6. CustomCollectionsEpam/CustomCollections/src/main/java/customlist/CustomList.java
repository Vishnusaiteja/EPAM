package customlist;

public class CustomList {
	public static void main(String[] args) {
		Integer[] array= {10,20,30,40,50,60,70,80,90,100};
    	MyCustomList<Integer> list = new MyCustomList<>(array);
    	list.add(30);
    	list.remove(10);
    	list.get(5);
    	list.print();
	}
}

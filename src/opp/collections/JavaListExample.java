package opp.collections;

public class JavaListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(3);
		list.add(7);
		list.add(2);
		
		list.sort(null);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
}

package opp.collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Honda");
        list.add("BMW");
        list.add("Ford");
        list.add("Mazda");
        
        list.remove(2);
        
        for (int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
		}
    }

}

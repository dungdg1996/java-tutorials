package opp.collections;

public class SortExample {
	public static void main(String[] args) {
		int[] array = {100, 7, 3, 5, 2};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					// đổi chổ
					int tam = array[i];
					array[i] = array[j];
					array[j] = tam;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

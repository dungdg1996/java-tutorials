package opp.collections;

import java.util.Comparator;
import java.util.Iterator;

public class ArrayList<E> {
	private Object[] array;
	private int size;
	
	

	public ArrayList() {
		array = new Object[5];
	}

	public E get(int i) {
		return (E) array[i];
	}

	public int size() {
		return size;
	}

	public void add(E entity, int viTri) {
		checkArray();
		for (int i = size - 1; i >= viTri ; i--) {
			array[i + 1] = array[i];
		}
		array[viTri] = entity;
		size++;
	}

	public void add(E entity) {
		checkArray();
		array[size] = entity;
		size++;
	}
	
	public void remove(int viTri) {
		for (int i = viTri; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	private void checkArray() {
		// check xem array đã đầy chưa
		if (size == array.length) {
			Object[] newArray = new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			this.array = newArray;
		}
	}

	public void sort(Comparator<Object> comparator) {
		if(comparator == null) {
			comparator = new Comparator<Object>() {
				@Override
				public int compare(Object o1, Object o2) {
					Integer i1 = (Integer ) o1;
					Integer i2 = (Integer ) o2;
					return i1 > i2 ? 1 : -1;
				}
			};
		}
		for (int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				// so sánh 2 object
				if(comparator.compare((E)array[i],(E) array[j]) == 1) {
					// đổi chỗ
					Object tamp = array[i];
					array[i] = array[j];
					array[j] = tamp;
				}
			}
		}
		
	}
}

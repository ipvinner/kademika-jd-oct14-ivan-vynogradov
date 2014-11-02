package Lesson4.hw.library;

import java.util.Arrays;
import java.util.Comparator;

public class ColumnComparator implements Comparator {
	int columnToSort;
	ColumnComparator(int columnToSort) {
		this.columnToSort = columnToSort;
	}
	//overriding compare method
	public int compare(Object o1, Object o2) {
		String[] row1 = (String[]) o1;
			//System.out.println("comparable" + Arrays.toString(row1));
		String[] row2 = (String[]) o2;
		//compare the columns to sort
		return row1[columnToSort].compareTo(row2[columnToSort]);
	}
}

package Lesson3;

import java.util.Arrays;

public class Video27_union {

	public static void main(String[] args) {
		
		int[] data1 = {1,2,3};
		int[] data2 = {4,5,6};
		
		System.out.println(Arrays.toString(union(data1, data2)));

	}
	
	static int[] union(int data1[], int data2[]){
		
		int lengthData1 = data1.length;
		int lengthData2 = data2.length;
		int lengthData3 = lengthData1 + lengthData2;
		
		int[] data3 = new int[lengthData3];
		
		for(int i = 0; i < lengthData1; i++){
			data3[i] = data1[i];
			data3[i+lengthData1] = data2[i];
		}
		return data3;
	}

}

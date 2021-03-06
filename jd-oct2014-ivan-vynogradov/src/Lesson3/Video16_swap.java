package Lesson3;

import java.util.Arrays;

public class Video16_swap {

	public static void main(String[] args) {
		
		int[] data = {1,2,18,4,24};
		
		System.out.println("before:" + Arrays.toString(data));
		swap(data);
		System.out.println("after:" + Arrays.toString(data));
		System.out.println("before:" + Arrays.toString(data));
		swapIf(data);
		System.out.println("after:" + Arrays.toString(data));
		
	}
	
	static void swap(int[] data){
		// changed position of array elements
		if(data != null){
			for(int i = 0; i < data.length - 1; i++){
				int temp = data[i];
				data[i] = data[i+1];
				data[i+1] = temp;
			}
		}
		
	}
	
	static void swapIf(int[] data){
		if(data != null){
			for(int i = 0; i < data.length - 1; i++){
				if(data[i] > data[i + 1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}else{
					System.out.println("Element less then next");
				}
			}
		}
	}
}

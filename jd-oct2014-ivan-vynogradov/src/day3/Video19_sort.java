package day3;

import java.util.Arrays;

public class Video19_sort {

	public static void main(String[] args) {
		
		int[] data = {1,2,18,4,24,-2,80,14,0};
		
		System.out.println("before:" + Arrays.toString(data));
		sort(data);
		System.out.println("after:" + Arrays.toString(data));
	}
	
	
	static void sort(int[] data){
		
		boolean exit = false;
		
		while(!exit){
			exit = true;
			for(int i = 0; i < data.length - 1; i++){
				if(data[i] > data[i + 1]){
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					exit = false;
				}
			}
		}
		
	}
	
}

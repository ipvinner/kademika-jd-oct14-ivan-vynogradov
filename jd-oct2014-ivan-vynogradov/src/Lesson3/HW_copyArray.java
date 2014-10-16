package Lesson3;

import java.util.Arrays;

public class HW_copyArray {

	public static void main(String[] args) {
		
		int[] data = {0, 1, 2, 3, 4};
		
		copyArray(data, 0, new int[3], 0, 3);
		
		
		
	}
	
	static void copyArray(int[] src, int srcPos, int[] dest, int destPos, int length){
			
			int elementsCount = 0;
		if(length != 0 && src != null){
			for(int i = 0; i < src.length; i++){
				if(i >= srcPos && elementsCount < length){
					dest[destPos] = src[i];
					//System.out.println("dest[]");
					elementsCount++;
					destPos++;
				}
			}
		}
		
		System.out.println(Arrays.toString(dest));
		
	}

}

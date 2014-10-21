package Lesson3;

public class HW_printArray {

	public static void main(String[] args) {
		String[][] data1 = {
				{"Ваня", "Света", "77"},
				{"Петя", "Наташа", "ttt"}};
		printArray(data1);
	}
	
	
	static void printArray(String[][] data){
		
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < data[i].length; j++){
				System.out.print("[ " + data[i][j] + " ]" + " ");
			}
			System.out.println();
		}
		
	}

}

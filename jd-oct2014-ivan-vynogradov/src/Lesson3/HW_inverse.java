package Lesson3;

public class HW_inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(inverse("Ivanv"));
	}
	
	static String inverse(String str){
		String result = null;
		
		if(str != null){
			char[] charArray = str.toCharArray();			
			char ch;
			
			for(int i = 0; i < charArray.length / 2; i++){
				ch = charArray[i];
				charArray[i] = charArray[charArray.length - 1 - i];
				charArray[charArray.length - 1 - i] = ch;
			}
			return new String(charArray);
			}
		return result;
	}

}

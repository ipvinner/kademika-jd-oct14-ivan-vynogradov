package lesson7.video17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrList = new ArrayList<String>();
		arrList.add("Vania");
		arrList.add("Ania");
		arrList.add("Olga");
		arrList.add("Andrey");
		arrList.add("Yulia");
		arrList.add("Dmitry");
		arrList.add("Petr");
		
		Collections.sort(arrList);
		
		for(int i = 0; i < arrList.size(); i++){
			System.out.println(arrList.get(i));
		}
		
		Collections.sort(arrList, new StringComparator());
		
		for(int i = 0; i < arrList.size(); i++){
			System.out.println(arrList.get(i));
		}
	}

}

package lesson7.video17;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		String str1 = o1.getName();
//        String str2 = o2.getName();
       
        int result = o1.compareTo(o2);
        if (result < 0){
        	return 1;
        } else if (result > 0){
        	return -1;
        }
        
        return 0;
	}

}

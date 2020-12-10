package programers;

import java.util.Arrays;

public class knum {

	public static void main(String[] args) {
	 String[] temp = new String[9];
	 int i = 0;
	 for( i = 0; i < 6; i++){
		 temp[i] = "하나";
		 
	 }
	 System.out.println(Arrays.toString(temp));
	 String[] temp2 = new String[i];
	 for(int j =0 ; j <temp2.length ; j++)
	 {
		 temp2[j] = temp[j];
	 }
	 System.out.println(Arrays.toString(temp2));
	}

}

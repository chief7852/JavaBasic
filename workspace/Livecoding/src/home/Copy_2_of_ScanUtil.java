package home;

import java.util.Scanner;

public class Copy_2_of_ScanUtil {
		//유틸리티 성향의 메서드인 경우 static을 붙인다.
	// Math.random(), Math.round(). System.out.println()
	
	private static Scanner s = new Scanner(System.in);
	
	public static String nextLine(){
		return s.nextLine();
	}
	
	public static int nextint(){
		return Integer.parseInt(s.nextLine());
	}
}

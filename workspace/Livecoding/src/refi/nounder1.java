package refi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class nounder1 {

	public static void main(String[] args) {
		long curr = System.currentTimeMillis();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String datetime2 = sdf2.format(new Date(curr));
		System.out.println("--> " + datetime2);
		
	
	}

}

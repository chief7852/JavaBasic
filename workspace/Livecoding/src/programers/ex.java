package programers;

import java.util.Arrays;

class ex {
   public static void main(String[] args) {
	
	   
    	int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	int[] n = new int[command.length];
    	for(int i = 0; i <command.length; i++){				
				for(int j=0;j < command[i].length; j++)
				 n[j] = command[i][j];
			
		}   
    	System.out.println(Arrays.toString(n));
    	}
}
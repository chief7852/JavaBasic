import java.util.Arrays;


public class Hello {

	public static void main(String[] args) {
		

	int[] arr = new int[10];
		
		for(int i = 0; i <arr.length; i++){
			arr [i] = (int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i <arr.length-1; i++){
		int min = i;
		for(int j = i+1; j < arr.length; j++){
			if(arr[min]>arr[j]){
				min = j;
				
			}
		}
				int temp = arr[i]; 
				arr[i] = arr[min];
				arr[min] = temp;
		
	}System.out.println(Arrays.toString(arr));
	}

}

package programers;

public class sum {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] temp = null ;
		int x = 0;
		for(int i = 0;i <numbers.length; i++)
		{
			for(int j =0; j<numbers.length;j++)
			{
				if(numbers[i] != numbers[j])
				{
					temp[x] = numbers[i] + numbers[j];
					x++;
				}
			}
			System.out.println(temp[i]);
		}
		
	}

}

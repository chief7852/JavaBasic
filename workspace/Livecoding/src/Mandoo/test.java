package Mandoo;

public class test {
	
	public static void main(String[] args) {
		int i = 0;
		while(true){
			i++;
			long end = System.currentTimeMillis();
			long start = System.currentTimeMillis();
			while((end-start)<100)
				end=System.currentTimeMillis();
			back(i);	
			
		}
	}
	
	
	static void back(int i)
	{
		
		String a = "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■";
			for(int j = 0; j <a.length();j ++)
			{
				System.out.print(a.charAt(i));
			}
		


	}
}

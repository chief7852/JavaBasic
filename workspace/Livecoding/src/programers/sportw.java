package programers;

import java.util.HashMap;
import java.util.Set;

public class sportw {
	public static void main(String[] args)
	{
		int n =3;
		int[] reserve = {1};
		int[] lost = {3};
		
		int[] student = new int[n];

		for (int i : reserve)
			student[i - 1]++;

		
		for (int i : lost)
			student[i - 1]--;

		for (int i = 0; i < student.length; i++)
			if (student[i] < 0)
				if (i != student.length - 1 && student[i + 1] > 0) {
					student[i]++;
					student[i + 1]--;
				} else if (i != 0 && student[i - 1] > 0) {
					student[i]++;
					student[i - 1]--;
				}

		int answer = 0;

		for (int i = 0; i < student.length; i++)
			if (!(student[i] < 0))
				answer++;
		System.out.println(answer);
		
	}
}



import java.util.Arrays;

public class PermCheck {
	
	
	public int solution (int []A)
	{

		
		Arrays.parallelSort(A,0,A.length);
		
		for(int i=0;i<A.length;i++)
			if(A[i]!=i+1)
				return 0;
		return 1;
	}
}

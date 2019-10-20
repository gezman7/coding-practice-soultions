

import java.util.Arrays;

public class MaxCounter2 {
	public int [] solution (int N,int []A)
	{
		int [] counters = new int[N];
		int [] temp = new int[N];
		Arrays.fill(counters, 0);
		
		int curMax=0;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>N)
				Arrays.fill(counters, curMax);
			else {
				counters[A[i]-1]++;
				if(counters[A[i]-1]>curMax)
					curMax=counters[A[i]-1];
			}
		}
	return counters;
	}
	

}



import java.util.Arrays;

public class MaxCounters3 {
	public int [] solution (int N,int []A)
	{
		int [][] counters = new int[2][N];
		
		for (int[] row : counters) 
            Arrays.fill(row, 0); 
		
		int curMax=0;
		int erase = -1;
		int adder =0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>N)
				{adder=adder+curMax;
				curMax=0;
				erase=i;
				}
				
			else {
			if(counters[1][A[i]-1]<=erase)	
				{counters[0][A[i]-1]=1;
				counters[1][A[i]-1]=i;}
			else {
				counters[0][A[i]-1]++;
				counters[1][A[i]-1]=i;
			}
				if(counters[0][A[i]-1]>curMax)
					curMax=counters[0][A[i]-1];
			}
		}
		

		for(int i=0;i<counters[0].length;i++)
			{if(counters[1][i]<=erase)
				counters[0][i]=adder;
			else
				counters[0][i]= counters[0][i]+adder;
			}
		
		int[] answer = counters[0];
	return answer;
	}
}

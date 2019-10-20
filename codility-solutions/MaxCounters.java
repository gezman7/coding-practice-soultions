

public class  MaxCounters{
	public int [] solution (int N,int []A)
	{
		int[] answer = new int[N];
		int adder=0;
		int curMax=0;
		
		int erase = 0;
		
		for(int i=0;i<answer.length;i++)
			answer[i]=0;
	
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>N)
				{
				adder=adder+curMax;
				erase= i;
				curMax=0;
				}
			else
			{answer[A[i]-1]++;
			if(answer[A[i]-1]>curMax)
				curMax=answer[A[i]-1];
			}
		}
		
		for(int i=0;i<answer.length;i++)
			answer[i]=0;
		
		for(int i=0;i<A.length;i++)
			if(i>erase&&A[i]<=N)
				answer[A[i]-1]++;
				
		
		for(int i=0;i<answer.length;i++)
			answer[i]=answer[i]+adder;
		
		
		return answer;
	}

}

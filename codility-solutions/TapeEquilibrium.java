

public class TapeEquilibrium{

	public int solution (int []A)
	{
		if(A.length==2)
			return Math.abs(A[0]-A[1]);
		
		
		int [] maxFromLeft= new int[A.length];
		int [] maxFromRight= new int[A.length];
		
		
		maxFromLeft[0]=A[0];
		maxFromRight[A.length-1]=A[A.length-1];
		int k;
		for (int i=1;i<A.length;i++)
		{
			k=(A.length-1)-i;
			maxFromLeft[i]=maxFromLeft[i-1]+A[i];
			maxFromRight[k]= maxFromRight[k+1]+A[k];
		}
		int minGap = Math.abs(maxFromLeft[0]-maxFromRight[1]);
		for(int i = 0;i<A.length-1;i++)
			if(Math.abs(maxFromLeft[i]-maxFromRight[i+1])<minGap)
				minGap= Math.abs(maxFromLeft[i]-maxFromRight[i+1]);
			
			
		
		return minGap;
	}
}

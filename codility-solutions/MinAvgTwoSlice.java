


public class MinAvgTwoSlice {
	 
	
	public int solution(int[] A) {
	        
		//dynamic table solution 
		
		double[][] opt = new double[2][A.length];
		
		//initialization
		if(A.length-2<0)
			return A[0];
		
		opt[0][A.length-1] = 10001;
		opt[1][A.length-1] = 1;

		for(int i=A.length-2;i>=0;i--)
		{	opt[0][i] =Math.min( (double)((opt[0][i+1]*opt[1][i+1]+A[i])/(opt[1][i+1]+1)), (double)(A[i]+A[i+1])/2);
			
			if( (double)((opt[0][i+1]*opt[1][i+1]+A[i])/(opt[1][i+1]+1))<  (double)(A[i]+A[i+1])/2)
				opt[1][i]=(opt[1][i+1]+1);
			else opt[1][i]=2;
			
			
		
		}
		double curMin=10001;
		int index =0;
		for(int i=0;i<A.length;i++)
			if(opt[0][i]<curMin)
			{
				index=i;
				curMin=opt[0][i];
			}
		
		
		
		return index;
	    }
	
}

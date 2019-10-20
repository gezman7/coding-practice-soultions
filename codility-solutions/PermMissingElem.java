import java.util.Arrays;

public class PermMissingElem {

	public int solution(int[]A)
	{
		if(A.length==0)
			return 1;

		
		Arrays.parallelSort(A,0,A.length);
		
		if(A[A.length-1]==100000)
			return 100001;
		
		for(int i =0;i<A.length;i++)
			if(A[i]!=i+1)
				return A[i]-1;
		return A[A.length-1]+1;
	}
}

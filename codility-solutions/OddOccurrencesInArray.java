

import java.util.Arrays;

public class OddOccurrencesInArray {

	public int  solution(int[] A)
	{
		 Arrays.parallelSort(A,0,A.length);
		 System.out.print(Arrays.toString(A));
		 int index =0;
		 for(int i=0;i<A.length;i=i+2)
			 {if(i+1<A.length&& A[i]!=A[i+1])
				 {index=i;
				 break;}}
		 if (index==0)
			 return A[A.length-1];
		 else return A[index];
				 
	}
}

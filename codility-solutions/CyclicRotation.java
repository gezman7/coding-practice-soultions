import java.util.ArrayList;

public class CyclicRotation {
	public int[]  solution(int[] A,int K)
	{
		
		if(A.length==0)
			return A;
		if (K==0|| K==A.length)
			return A;

		while(K>A.length)
			K=K-A.length;
			
			
	

		ArrayList<Integer> aList= new ArrayList<Integer>();
		for(int i=0;i<K;i++)
			aList.add(A[A.length-K+i]);
		
		for(int j=0;j<A.length-K;j++)
			aList.add(A[j]);
		
		
		int [] array= new int[A.length];
		for(int k =0; k<aList.size();k++)
			array[k]=aList.get(k);
		return array;
	}

}

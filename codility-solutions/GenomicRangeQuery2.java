

//nice dynamic solution.
public class GenomicRangeQuery2 {
	
	public int[] solution(String S, int[] P, int[] Q) {
		
		char[] ch = S.toCharArray();
		int[] numDna = new int[S.length()];
		
		for(int i =0; i<S.length();i++)
		{
			switch(ch[i]) {
			
			case 'A':
				numDna[i]=1;
				break;
			case 'C':
				numDna[i]=2;
				break;
			case 'G':
				numDna[i]=3;
				break;
			case 'T':
				numDna[i]=4;
				break;
				
			}
			
				}
		int[]M =new int[P.length];
		int curMin =4;
		for(int i=0;i<P.length;i++)
		{
			for(int k=P[i];k<=Q[i];k++)
			{
				if(numDna[k]<curMin)
					curMin=numDna[k];
			}
			M[i]=curMin;
			curMin=4;
			
				
		}
			
	  return M;
	    }
}

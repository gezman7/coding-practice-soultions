

//nice dynamic solution.
public class GenomicRangeQuery {
	
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
		
		int[][] dynamicTable= new int[S.length()][S.length()];
			
			//establishing the array
			for(int i=0;i<S.length();i++)
			{
				dynamicTable[i][i] = numDna[i];
			}
			
			//returning formula:
			//opt(i,j)=max(opt(i,j-1),opt(i+1,j)
			
			for(int k=1;k<S.length();k++)
			{
				for(int i=0;i<S.length();i++)
				{
					if((i+k)<S.length())
						dynamicTable[i][i+k]=  Math.min(dynamicTable[i][i+k-1], dynamicTable[i+1][i+k]);
				}
				
			}
			
			int[]M =new int[P.length];
			
			for(int i=0;i<M.length;i++)
			{
				M[i] = dynamicTable[P[i]][Q[i]];
			}
	  

	  return M;
	    }
}

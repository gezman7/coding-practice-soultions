import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne{
	
	public int solution (int X,int []A)
	{
		
		int answer =0;
		Set<Integer> route= new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
			{if(A[i]>X)
				continue;
			else route.add(A[i]);
			if (route.size()==X)
				{answer =i;
				break;
				}
			
			}
		return answer;
	}
		

}

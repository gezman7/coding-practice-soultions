

public class PassingCars {
	  public int solution(int[] A) {
		  
		  
		  int[]B= new int[A.length];
		  int counter =0;
		  for(int i=0;i<A.length;i++)
		  {
			  if(A[i]==1)
				  B[i]=counter;
			  else 
			  {
				  counter++;
				  B[i]=0;
			  }
		  }
		  int answer=0;
		  for(int i=0;i<B.length;i++)
			  answer=B[i]+answer;
	 
	if (answer>1000000000||answer<0)  
		return -1;
	  return answer;
	  }
}

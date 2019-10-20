
import java.util.Arrays; 

public class MissingInteger{

	public int  solution (int []A)
	{
		 Arrays.parallelSort(A,0,A.length);
		 int num =1;
		 int answer =0;
		 int positiveStart = 0;
		 
		 while(A[positiveStart]<0)
			 positiveStart++;
		 
		 for(int i= positiveStart;i<A.length;i++)
		 {

			 
			 if(A[i]>num)
				 {answer=num;
				 break;}
			 while(A[i]==num)
			 {
				 i++;
			 }
			 num++;
			 
			 if(A[i]>num)
			 {answer=num;
			 break;}
			 
		 }
		 
		return answer;
	}
}

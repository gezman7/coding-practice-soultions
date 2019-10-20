
public class FrogJmp {
    
	
	public int solution(int X, int Y, int D) 
	{
		if (X==Y)
			return 0;
		
		double length = X-Y;
		double d=D;
		
		double jumps = (length/D);
		if(jumps>Math.abs(jumps))
			jumps=Math.abs(jumps)+1;
		int answer = (int)jumps;
        
        return answer;
    }
}



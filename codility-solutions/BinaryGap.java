
public class BinGap {

	public int gap(int n)
	{int answer=1;
	
	String str =Integer.toBinaryString(n);
	
	boolean inside =false;
	
	char [] c = str.toCharArray();
	int temp=0;
	int max=0;
	
	for(int i=0;i<str.length();i++)
		if(!inside)
			{if(c[i]=='1')
				inside=true;
				temp=0;}
		else {
			if(c[i]=='1')
				{
				if (temp>max)
					max=temp;
				temp=0;
				}
			else {
				temp++;
			}
		}
	
	
			
	
		return max;
	}
}

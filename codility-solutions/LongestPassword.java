

public class LongestPassword
 {
    public int solution(String S) {
        // write your code in Java SE 8
        
        char[] input = S.toCharArray();
        int length =0;
        int numAlf = 0;
        int numDig= 0;
        int maxLength= 0;
        boolean legal= true;
        
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==' ')
                {   
                    if(legal)
                    {
                    if((numDig%2!=0)&&(numAlf%2==0)&&length>maxLength)
                        maxLength=length;
                    }
                    length=0;
                    legal=true;
                    numDig=0;
                    numAlf=0;
                } else
                {
                    if(Character.isDigit(input[i]))
                            numDig++;
                    else {if(Character.isAlphabetic(input[i]))
                            numAlf++;
                        else legal=false;
                        
                    length++;    
                    }
                }
            
        }
        
                            if(legal)
                    {
                    if((numDig%2!=0)&&(numAlf%2==0)&&length>maxLength)
                        maxLength=length;
                    }
        
       return maxLength;
    }

}

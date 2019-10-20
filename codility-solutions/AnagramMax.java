

import java.util.*;

public class AnagramMax {
	

	    // Complete the makeAnagram function below.
	    static int makeAnagram(String a, String b) {

	        HashMap<Character,Integer> hashA = new HashMap<>();
	        HashMap<Character,Integer> hashB = new HashMap<>();
	        char[] arrA =a.toCharArray();
	        char[] arrB =b.toCharArray();

	        for(Character ch: arrA)
	            addToHash(ch,hashA);

	        for(Character ch: arrB)
	            addToHash(ch,hashB);

	        int result = numOfDeletions(hashA,hashB);

	        return result;        
	    }

	    static void addToHash(char ch, HashMap<Character,Integer> hash)
	    {
	        int freq=1;
	        if(hash.containsKey(ch))
	        {
	            freq = hash.get(ch)+1;
	            hash.remove(ch);
	        }
	        hash.put(ch,freq);
	    }

	    static int numOfDeletions(HashMap<Character,Integer> a,HashMap<Character,Integer> b)
	    {
	        int result =0;
	        Iterator aIterator = a.entrySet().iterator();
	        Iterator bIterator;
	        char tempKey;

	        while(aIterator.hasNext())
	        {   
	            tempKey = ((char)((Map.Entry)(aIterator.next())).getKey());
	            if(!b.isEmpty())
	                if(b.containsKey(tempKey)) {
	                    result =result+ Math.abs(a.get(tempKey)-b.get(tempKey));
	                    b.remove(tempKey);
	                }
	                else result = result + a.get(tempKey);
	            else result = result + a.get(tempKey);            
	        }

	        if(!b.isEmpty())
	        {
	            bIterator = b.entrySet().iterator();
	            while(bIterator.hasNext())
	            {
	               tempKey = ((char)((Map.Entry)(bIterator.next())).getKey());
	               result =result+b.get(tempKey);
	            }
	        }

	        return result;
	        

	    
}
	    
	    public static void main(String[] args)
	    {
	    	System.out.println(makeAnagram("cde","abc"));
	    }
}


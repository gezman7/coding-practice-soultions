

import java.util.Stack;

public class IsBalanced {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charr = s.toCharArray();

        for(int i = 0;i<charr.length;i++)
            {
                if(charr[i]=='('||charr[i]=='['||charr[i]=='{')
                    stack.push(charr[i]);
                else if(charr[i]!=(char)stack.pop())
                        return "NO";    
            }
        if(stack.isEmpty())
            return "YES";
        else return "NO";        

    }
    
    public static void main(String[] args)
    {
    	System.out.print(isBalanced("{[()]}"));
    }
}

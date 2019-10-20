

import java.util.*;

public class Graph {
	
	    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
	    
	        //if libaries cheaper then roads
	        if(c_lib<=c_road)
	        return c_lib*n;



	        HashMap<Integer,LinkedList<Integer>> graph = new HashMap<>();
	        Stack<Integer> stack = new Stack<>();
	        //intilize graph

	        //adding cities to graph
	        for(int i=1;i<=n;i++){
	            graph.put(i,new LinkedList<Integer>());
	            stack.push(i);
	            }

	        //adding roads to list of cities
	        for(int i=0;i<cities.length;i++){
	            graph.get(cities[i][0]).add(cities[i][1]);
	            graph.get(cities[i][1]).add(cities[i][0]);
	        }

	        int counterOfTrees=0;
	        boolean[] discovered = new boolean[n];
	        
	        for(boolean city:discovered)
	            city=false;

	        int roads=0;
	        int tempRoads;
	        long calc =0;
	        int [] answers=new int[2];
	        
	        while(!stack.isEmpty()){
	           
	           answers =bfs(stack.pop(),discovered,graph);
	           if(answers[0]==1)
	        	   counterOfTrees++;
	           
	        roads+=answers[1];

	        }
	        calc = counterOfTrees*c_lib+roads;
	        
	        return calc;


	    }
	    
	    
	    static int[] bfs(int root,boolean[] discovered,HashMap<Integer,LinkedList<Integer>> graph)
	    {
	    	int[] result = new int[2];
	    	
	    	if(discovered[root-1]==false)
	    		{
	    		result[0]=1;
	    		Stack<Integer> tempStack=new Stack<>();
	    		tempStack.push(root);
	    		result[1] = bfsRoads(tempStack,discovered,graph)-1;
	    		}else {
	    			result[0]=0;
	    			result[1]=0;
	    			
	    		}
	    	
	    	
	    	return result;
	    	
	    }
	    
	    
	   private static int bfsRoads(Stack<Integer> tempStack, boolean[] discovered,
				HashMap<Integer, LinkedList<Integer>> graph) {
		   
		   int tempCity;
		   if(tempStack.isEmpty())
			   return 0;
		   
		  tempCity =  tempStack.pop();
		  
		  if(discovered[tempCity-1]==true)
			return bfsRoads(tempStack,discovered,graph);
		  
		  discovered[tempCity-1]=true;
		  
		  while(!graph.get(tempCity).isEmpty())
			  tempStack.push(graph.get(tempCity).pop());
		  
		  return 1+ bfsRoads(tempStack,discovered,graph);
		}
	public static void main(String[] arg) {
	    	int[][] cities= {{1,2},{3,1},{1,4}};
	    	int n= 5;
	    	int c_lib =6;
	    	int c_road=1;
	    	long toPrint = roadsAndLibraries(n,c_lib,c_road,cities);
	    	System.out.println(toPrint);
	    	}
	    	
	    }



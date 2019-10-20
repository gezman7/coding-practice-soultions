package trees;
import java.util.*;


public class Orders {
	
	public static ArrayList<Integer> inOrder(Node root) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		inOrderRec(root,answer);
		
		return answer;
		
	}

	private static void inOrderRec(Node root, ArrayList<Integer> answer) {
		
		if(root.getLeft()!=null)
			inOrderRec(root.getLeft(),answer);
		
		answer.add(root.getData());
		
		if(root.getRight()!=null)
			inOrderRec(root.getRight(),answer);
	}
	
	public static ArrayList<Integer> preOrder(Node root){
		ArrayList<Integer> answer = new ArrayList<>();

		preOrderRec(root,answer);
		
		
		return answer;
		
	}
	
	
	private static void preOrderRec(Node root, ArrayList<Integer> answer) {
	
		
			answer.add(root.getData());
				
		
		if(root.getLeft()!=null)
			inOrderRec(root.getLeft(),answer);
		
		if(root.getRight()!=null)
			inOrderRec(root.getRight(),answer);

		
		
	

		
	}		
	
	public static ArrayList<Integer> postOrder(Node root){
			ArrayList<Integer> answer = new ArrayList<>();

			postOrderRec(root,answer);
			
			
			return answer;
			
		}

	private static void postOrderRec(Node root, ArrayList<Integer> answer) {
		
		
		
	if(root.getLeft()!=null)
		inOrderRec(root.getLeft(),answer);
	
	if(root.getRight()!=null)
		inOrderRec(root.getRight(),answer);
	
	answer.add(root.getData());
	
	
		
	}

	public static void main(String [] args) {
		
		Node n5= new Node(null,null,10);
		Node n6= new Node(null,null,15);
		Node n2= new Node(null,null,3);
		Node n3= new Node(null,null,7);
		
		Node n4= new Node(n5,n6,11);
		Node n1= new Node(n2,n3,6);
		
		Node root= new Node(n1,n4,8);
		
		System.out.println( inOrder(root).toString());
		System.out.println( preOrder(root).toString());
		System.out.println( postOrder(root).toString());


		
		
	
		
		


		
		
	}

	
}

package trees;

public class Node {
	
private Node left=null;
private Node right=null;
private int data;

public Node(Node left,Node right,int data)
{
	this.left=left;
	this.right = right;
	this.data=data;
}

public Node getLeft()
{
	return this.left;
}

public Node getRight() {
	
	return this.right;
}

public int getData()
{
	return this.data;
}

public void setLeft(Node left) {
	this.left= left;
}

public void setRight(Node right) {
	this.right= right;
}
}

import java.util.Scanner;

public class BSTNode {
	int data;
	BSTNode right,left;
	
	public BSTNode(int n ){
		right = null;
		left = null;
		data = n;
		
	}
	public void setRight(BSTNode n)	{
	   right = n;
	}
	public void setLeft(BSTNode n){
		left = n;
	}	
	public void setData(int d){
		data = d;
	}
	public BSTNode getRight(){
		return right;
	}
	public BSTNode getLeft(){
		return left;
		
	}
	public int getData(){
		return data;
	}
}

import java.util.Scanner;

public class BST {
	
	private BSTNode root;
	
	public BST(){
		root = null;
	}
	public boolean isEmpty(){
	
		return	root == null;		
	}
	public void insert(int data){
		root = insert(root,data);
	}
	private BSTNode insert(BSTNode node,int data){
		if(node == null){
			node = new BSTNode(data);
		}
		else
		{
			if(data <= node.getData())
				node.left = insert(node.left,data);
			else
				node.right = insert(node.right,data);
				
		}
		return node;
			
	}
	public void delete(int k){
		if(isEmpty()){
			System.out.println("The tree is empty");
			
		}
		else if(search(k)== false){
			System.out.println("The not prensent in tree");
		}
		else{
			root = delete(root,k);
			System.out.println("Node deleted form tree");
		}
			
	}
	private BSTNode delete(BSTNode root,int k){
		BSTNode p,p2,n;
		if(root.getData()== k){
			BSTNode lt,rt;
			lt =root.getLeft();
			rt = root.getRight();
			if(lt==null && rt==null){
				return null;
				
			}
			else if(lt == null){
			    p=rt;
			    return p;
			}
			else if(rt == null){
				p = lt;
				return p;
			}	
			else{
				p2 = rt;
				p = rt;
				while(p.getLeft()!=null)
					p = p.getLeft();
					p.setLeft(lt);
				
				return p2;
			}
				
		}
		if(k<root.getData()){
			n = delete(root.getLeft(),k);
			root.setLeft(n);
		}
		else{
			n = delete(root.getRight(),k);
			root.setRight(n);
		}
		return root;
		
		
	}
	
	public boolean search(int val){
		return search(root,val);
	} 
	private boolean search(BSTNode r,int val){
		boolean found = false;
		while((r!=null) && !found){
			int rval = r.getData();
			if(val<rval){
				r = r.getLeft(); 
			}
			else if(val>rval){
				r = r.getRight();
			}
			else
			{
				found = true;
				break;
			}
				
		}
		
		return found;
	}
	public int CountNodes(){
		return CountNodes(root);
	}
	
	private int CountNodes(BSTNode r){
		
		int l = 1;
		if(r == null)
		{
			return 0;
			
		}
		l += CountNodes(r.getLeft());
		l += CountNodes(r.getRight());
		
		return l;
	}
	
	public void inorder(){
		inorder(root);
	}
	private void inorder(BSTNode r){
		if(r!= null){
			inorder(r.getLeft());
			System.out.println(r.getData() +" ");
			inorder(r.getRight());			
			
		}
	}
	public void preorder(){
		preorder(root);
	}
	private void preorder(BSTNode r){
		if(r!=null)
		{
			
			System.out.println(r.getData()+" ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	public void postorder(){
		postorder(root);
		
	}
    private void postorder(BSTNode r){
    	if(r!=null)
    	{
    	postorder(r.getLeft());
    	postorder(r.getRight());
    	System.out.println(r.getData()+" ");
    	}
    }	
}

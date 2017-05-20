import java.util.Scanner;


public class BinarySearchTree {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		BST bst = new BST();
		
		System.out.println("Binary Serach Tree\n");
		char ch = 0;
		
		do{
			System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
            
            int choice = scanner.nextInt();
            
            switch(choice)
            {
            case 1:
            	System.out.println("Enter the element to be insert");
            	bst.insert(scanner.nextInt());
            	break;
            case 2:
            	System.out.println("Enter the element to be deleted");
            	bst.delete(scanner.nextInt());
            	
            	break;
            case 3:
            	System.out.println("Enter the element to be deleted");
            	bst.search(scanner.nextInt());
            	break;
            case 4:
            	 System.out.println("Nodes = "+ bst.CountNodes());
            	break;
            case 5:
            	System.out.println("Empty status = "+ bst.isEmpty());
                break;  
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
                        
            }
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scanner.next().charAt(0);        
            
            
		}while(ch == 'y' || ch == 'Y');
		
		
	}
	
	
}

package MainPack;

public class BinaryTree
{
	
	 String indent = "";
	 int sh=0;
	class Node {
	    int value1;
	    Node left;
	    Node right;

	    Node(int value) {
	        this.value1 = value;
	        right = null;
	        left = null;
	    }
	}
	 
	 Node root;
	
	private Node addRecursive(Node current, int value1,int depth)
	{
		
		
	    if (current == null) 
	    {
	        return new Node(value1);
	    }

	    if (value1 < current.value1)
	    {
	        current.left = addRecursive(current.left, value1,depth+=1);
	        
	    } 
	    
	    
	    else if (value1 >= current.value1)
	    {
	        current.right = addRecursive(current.right, value1,depth+=1);
	        
	    }
	    
	    else 
	    {
	        // value already exists
	        return current;
	    }
	    
	    return current;
	}
	
	
	public void add(int value1,int depth)
	{
	    root = addRecursive(root, value1,depth);
	}
	
	public void level()
	{
		System.out.println(sh);
	}
	
	
	
	 private void printNode (Node node)
	    {
		    int d=maxDepth();
		 
	        if (node==root)
	        {
	            System.out.print("Root: ");
	        }
	        else if (root.left==node)
	        {
	            System.out.print("Left Child: ");
	        }
	        else if (root.right==node)
	        {
	            System.out.print("Right Child: ");
	        }
	        for(int i=0; i<d; i++)
	        {
	            System.out.println("hjhfhjvhj"+node.value1+ " ");
	        }
	      //  System.out.println("Level: " + node.getLevel());
	        if(node.left!=null)
	        {
	            indent = indent + "----";
	            System.out.print(indent);
	            printNode(node.left);
	            indent = indent.substring(0,indent.length()-4);
	        }
	        if(node.right!=null)
	        {
	            indent = indent + "----";
	            System.out.print(indent);
	            printNode(node.right);
	            indent = indent.substring(0,indent.length()-4);
	        }
	    }
	 
	 public void printNode ()
	 {
		 printNode (root);
	 }
	 
	 /*
	 public void printTree(Node p, int tab, String childMark){

	      if(p==null) return;

	        System.out.print("lvl= "+tab);

	        for(int i=0;i<tab*2;i++) System.out.print("--");

	        if(childMark!="null") {
	            System.out.print(childMark+"[");

	           // for (int i = 0; i < p.co_ord.size() - 1; i++)
	             //   System.out.print(p.co_ord.get(i) + ", ");
	            System.out.println(p.value + " ]");
	        }
	        else{
	             System.out.print("  [ ");
	           // for (int i = 0; i < p.co_ord.size() - 1; i++)
	              //  System.out.print(p.co_ord.get(i) + ", ");
	            System.out.println(p.value+ " ]");

	        }
	        
	        tab++;
	        printTree(p.left, tab,"Left");
	        printTree(p.right,tab,"Right");

	    }
	 
	 
	 
	 
	 public void pt()
	 {
	 printTree(root,0,"null");
	 }

	 
	 
	 */
	 
	 
	 public void print1() {
	        print1("", root, false);
	    }

	    public void print1(String prefix, Node n, boolean isLeft) {
	        if (n != null) {
	            System.out.println (prefix + (isLeft ? "|-- " : "|-- ") + n.value1);
	            print1(prefix + (isLeft ? "|   " : "    "), n.left, true);
	            print1(prefix + (isLeft ? "|   " : "    "), n.right, false);
	        }
	    }
	 
	 
	
	public int maxDepth(Node root)
	{
	  // Root being null means tree doesn't exist.
	  if (root == null)
	    return 0;
	  
	  // Get the depth of the left and right subtree 
	  // using recursion.
	  int leftDepth = maxDepth(root.left);
	  int rightDepth = maxDepth(root.right);

	  // Choose the larger one and add the root to it.
	  if (leftDepth > rightDepth)
	    return leftDepth + 1;
	  else
	    return rightDepth + 1;
	}
	
	
	public int maxDepth()
	{
		 
		return maxDepth(root);
		//System.out.println("depth is: "+ maxDepth(root));
	}
	
	
	
	void PrintGivenLevel(Node node, int level) 
	{ 
	    if (node == null) 
	        return; 
	    if (level == 1) 
	        System.out.println("Root: "+node.value1); 
	    
	    
	    else if (level > 1) 
	    { 
	    	/*
	    	if (node==root)
	        {
	            System.out.print("Root: ");
	        }
	        */
	         if (root.left==node)
	        {
	            System.out.print("Left Child: ");
	        }
	        else if (root.right==node)
	        {
	            System.out.print("Right Child: ");
	        }
	      
	    	
	    	 if(node.left!=null)
		        {
		            indent = indent + "----";
		            System.out.print(indent);
		            PrintGivenLevel(node.left, level); 
		            indent = indent.substring(0,indent.length()-4);
		        }
	    	
	    		  // PrintGivenLevel(root.left, level-1); 
	    
	    	 
	    	 if(node.right!=null)
		        {
		            indent = indent + "----";
		            System.out.print(indent);
		            PrintGivenLevel(node.right, level+1); 
		            indent = indent.substring(0,indent.length()-4);
		        }
	       // PrintGivenLevel(root.right, level-1); 
	    } 
	} 
	
	private boolean search(Node r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.value1;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
               // System.out.println("found");
                break;
            }
           // System.out.println("not found");
            found = search(r, val);
        }
        return found;
    }
	
	
	
	
	 public boolean search(int val)
     {
         return search(root, val);
     }
	
	
	
	
	
	
	
	public void print(Node root)
	{
		 int h = maxDepth(); 
		    int i; 
		    for (i=1; i<=h; i++) 
		    {   System.out.println("level "+i+":");
		        PrintGivenLevel(root, i); 
		        System.out.println(); 
		    } 
		
	}
	
public void print()
{
  print(root);	
}




public void traversePreOrder(Node node) 
{
    if (node != null) {
        System.out.print(" " + node.value1);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}
public void traversePreOrder()
{
	traversePreOrder(root);
}
	/*
	 * 
	 * 
	 * 
	 * public void traversePreOrder(Node node) 
	{
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	 * 
	 * 
	void PrintGivenLevel(Node root, int level) 
	{ 
	    if (root == null) 
	        return; 
	    if (level == 1) 
	        System.out.println(root.value); 
	    else if (level > 1) 
	    { 
	       //System.out.println("left:");
	    		   PrintGivenLevel(root.left, level-1); 
	     //  System.out.println("right:");
	        PrintGivenLevel(root.right, level-1); 
	    } 
	} 
	
	
	
	public void print(Node root)
	{
		 int h = 3; 
		    int i; 
		    for (i=1; i<=h; i++) 
		    {   System.out.println("level "+i+":");
		        PrintGivenLevel(root, i); 
		        System.out.println(); 
		    } 
		
	}
	


	public void traversePreOrder()
	{
		traversePreOrder(root);
	}
	
	
	
	public void printByDepth()
	{
		print(root);
	}
*/
}






/*
                       6 
                      / \
                     4   8
                    / \ / \
                   3  5 7  9
                   
                    inorder :6 4 3 5 8 7
                    depth:3
                    
 */                 

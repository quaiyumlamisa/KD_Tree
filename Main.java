package MainPack;
import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		BinaryTree bt=new BinaryTree();
		/*
		bt.add(20);
	    bt.add(15);
	    bt.add(10);
	    bt.add(17);
	    bt.add(30);
	    bt.add(25);
	    bt.add(33);
	    bt.add(8);
	    bt.add(9);
	    bt.add(7);
	    */
		bt.add(3,0);
	    bt.add(17,0);
	    bt.add(13,0);
	    bt.add(6,0);
	    bt.add(9,0);
	    bt.add(2,0);
	    bt.add(10,0);
	    bt.add(3,0);
		
	    bt.traversePreOrder();
	    System.out.println();
	  //  bt.maxDepth();
	   // bt.printByDepth();
	 //  bt.printNode();
	   // bt.print();
	    /*
	    System.out.println("Enter integer element to search");
	    
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    
	    
	    System.out.print("Search result :");
	    if(bt.search(a)==true)
	    	System.out.println("found");
	    
	    else
	    	System.out.println("not found");

       // System.out.println("Search result : "+ bt.search(a));
        
System.out.println("Enter integer element  to add");
	    
	    Scanner sc1=new Scanner(System.in);
	    int b=sc1.nextInt();

        bt.add(b);
        bt.traversePreOrder();
        
        */
        bt.print1();
        
	   
        
        
	   
	}

}

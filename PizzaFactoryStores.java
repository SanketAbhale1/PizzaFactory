	import java.util.*;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class PizzaFactoryStores 
	{  Scanner sc=new Scanner(System.in);
	   String psize;
	   int cost;
	  
	     class store1 extends PizzaFactoryStores
	     {ArrayList<String>pizza;
	    	 public store1()
	      {
	         System.out.println("Welcome to Vegeterian Pizza At PizzaFactory!!!!!!!");
	         System.out.println("Party Time!");

		  int choice;
		do
	      {
			pizza=new ArrayList<>();
			pizza.add("1] Deluxe vegeterian ");
	                
			pizza.add("2] cheese n corn ");
			
			pizza.add("3] paneer tikka");
			
			pizza.add("4] Chef's Special");
			
			Iterator<String>i=pizza.iterator();
			while(i.hasNext())
			{
				String var=(String)i.next();
				System.out.println(var);
				 //System.out.println("-------------------------------------------------------------");
			}
			
			System.out.println("Enter your pizza choice");
			choice=sc.nextInt(); 
	                
			
			switch(choice)
			{  
			case 1: System.out.println("Kindly select the size in which you would like your pizza?,We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                         if(psize.equals('r')||psize.equals('R'))
	                         cost=150;
	                         else  if(psize.equals('m')||psize.equals('M'))
	                         cost=175;
	                          else  if(psize.equals('l')||psize.equals('L'))
	                         cost=160;
	                       
				break;
			case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=200;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=375;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=290;
				break;
			case 3:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=325;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=475;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=340;
				break;
			case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
	                        psize=sc.next();
	                        if(psize.equals('r')||psize.equals('R'))
	                         cost=92;
	                        else  if(psize.equals('m')||psize.equals('M'))
	                         cost=129;
	                        else  if(psize.equals('l')||psize.equals('L'))
	                         cost=198;
				break;
			default:
				break;
			}
			
	      }
		  while(choice!=5)	;
		}
		
		
		
	        }
		
	}
	        class store2 extends PizzaFactoryStores
	        {
	        	Scanner sc=new Scanner(System.in);
	        	String psize;
	        	int cost=0;
	        	 public void store2()
	        	{System.out.println("Non Vegeterian Pizza at PizzaFactory!!!!!!!");
	                                                        
	        	int choice1;
				do
	            {
	      		ArrayList<String>a1=new ArrayList<>();
	      		a1.add("1] Non Veg Supreme");
			
	      		a1.add("2]chicken tikka");
			
	      		a1.add("3] pepper Barbecue chicken ");
			
	      		a1.add("4] Giddy Up BBQ Chicken");
			
	      		Iterator<String>i1=a1.iterator();
	      		while(i1.hasNext())
	      		{
	      			String var1=(String)i1.next();
	      			System.out.println(var1);
	      			 //System.out.println("-------------------------------------------------------------");
	      		}
	      		
	      		System.out.println("Enter your pizza choice");
	      		 choice1= sc.nextInt(); 
	      		
	      		switch(choice1)
	      		{
	      		case 1:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=190;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=210;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=320;
	      			break;
	      		case 2:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=325;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=370;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=380;
	      			break;
	      		case 3:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=425;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=500;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=525;
	      			break;
	      		case 4:System.out.println("Kindly select the size in which you would like your pizza?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=92;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=129;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=198;
	      			break;
	      		default:
	      			break;
	      		}
	      		
	            }
	      	  while(choice1!=5)	;
	      	}
	        	
	        	
	        }	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	       
		
		
	         class store3
		    {
		    	
		    	Scanner sc=new Scanner(System.in);
		    	 public	void store3()
	        	{  System.out.println("Veg Toppoingd At  PizzaFactory!!!!!!!");
	                                  System.out.println("MAKE !T GREAT");
	        	int choice1;
	        	String psize;
	        	int cost=0;
				do
	            {
	      		ArrayList<String>a1=new ArrayList<>();
	      		a1.add("1] Blac Olive");

	      		a1.add("2] Capsicum");

	      		a1.add("3] Paneer ");
	      		a1.add("4] Mushroom ");
	      		Iterator<String>i1=a1.iterator();
	      		while(i1.hasNext())
	      		{
	      			String var1=(String)i1.next();
	      			System.out.println(var1);
	      			 //System.out.println("-------------------------------------------------------------");
	      		}
	      		
	      		System.out.println("Enter your pizza choice");
	      		 choice1= sc.nextInt(); 
	      		
	      		switch(choice1)
	      		{
	      		case 1:System.out.println("select Which Veg toppins you want ?We offer 1]Black olive[b],2]Capsicum[c] and ]Paneer[p]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=100;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=245;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=320;





	      			break;
	      		case 2:System.out.println("Select Which Veg toppins you want?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=160;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=320;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=425;
	      			break;
	      		case 3: System.out.println("select Which Veg toppins you want?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=295;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=395;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=510;
	      			break;
	      		case 4:System.out.println("select Which Veg toppins you want?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=260;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=470;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=595;
	      			break;
	      		default:
	      			break;
	      		}
	      		
	            }
	      	  while(choice1!=5)	;
	      	}
	        	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    }
		
		 class store4
		 
		 
		 {
			 Scanner sc=new Scanner(System.in);
			 public	void store4()
	     	{   System.out.println("Welcome to Non VEg Toppins At PizzaFactory!!!!!!!");
	              
	     	int choice1;
	     	String psize;
	     	int cost=0;
				do
	         {
	   		ArrayList<String>a1=new ArrayList<>();
	   		a1.add("1]chicken tikka ");
	   		a1.add("2]Barbeque Chicken ");
	   		a1.add("3]Grilled Chicken  ");
	   		a1.add("4]Super Chicken Twist ");
	   		Iterator<String>i1=a1.iterator();
	   		while(i1.hasNext())
	   		{
	   			String var1=(String)i1.next();
	   			System.out.println(var1);
	   			 //System.out.println("-------------------------------------------------------------");
	   		}
	   		
	   		System.out.println("Enter your pizza choice");
	   		 choice1= sc.nextInt(); 
	   		
	   		switch(choice1)
	   		{
	   		case 1:

	 			System.out.println("Kindly select the Non veg toppins?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
                psize=sc.next();
                if(psize.equals('r')||psize.equals('R'))
                 cost=35;
                else  if(psize.equals('m')||psize.equals('M'))
                 cost=40;
                else  if(psize.equals('l')||psize.equals('L'))
                 cost=45;
	   			break;
	   		case 2:System.out.println("Kindly select the Non veg toppins?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=45;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=50;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=55;
	   			break;
	   		case 3:System.out.println("Kindly select the Non veg toppins?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=92;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=129;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=198;
	   			break;
	   		case 4:System.out.println("Kindly select the Non veg toppins?We offer 1]Regula[r],2]Medium[m] and ]Large[l]");
            psize=sc.next();
            if(psize.equals('r')||psize.equals('R'))
             cost=40;
            else  if(psize.equals('m')||psize.equals('M'))
             cost=45;
            else  if(psize.equals('l')||psize.equals('L'))
             cost=50;
	   			break;
	   		default:
	   			break;
	   		}
	   		
	         }
	   	  while(choice1!=5)	;
	   	}
}
		 
		 





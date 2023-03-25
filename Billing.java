class Billing extends PizzaFactoryStores
{
	final double tax=0.10;
	double amount=0;
	double total_amt=0;
 
	void calc()
	{	
		amount =cost;
		total_amt=amount*tax;
	}
	void display()
	{custo d=new custo();
	
	
		System.out.println(d.name+" Here is your order.");

		System.out.println("Tax for the above order is "+tax);
		System.out.println("Total due is "+total_amt);
		System.out.println("We accept all major VISA and Mastercard !!!" );
		System.out.println("Self Service ");
		System.out.println("Thanking you!!");
	}


}




import java.util.*;
interface cust


{


void feedback();

}
 class custo implements cust
{
Scanner sc=new Scanner(System.in);
String name,address;
long phone_no;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhone_no() {
	return phone_no;
}
public void setPhone_no(long phone_no) {
	this.phone_no = phone_no;
}


public void feedback()
{
System.out.println("We Would Like To know Your feedback?");
System.out.println("Select a no based on our services so that we can serve you etter next time");
System.out.println("5-Excellent Service");
System.out.println("4-Very Good Service");
System.out.println("3-Good Service");
System.out.println("2-Satisfactory");
System.out.println("1-Poor");
System.out.println("USE NUMBERS BETWEEN 1 TO 5 TO RATE OUR SERVICES");
int fdno=sc.nextInt();
try
{
if(fdno<=5)
  System.out.println("Thank You for your feedback ,We are pleased to know your kind feedback.\n HOPE TO SEE YOU AGAIN!");
    else 
       throw new ArithmeticException();
System.out.println("0k");
}


catch( ArithmeticException e)
    {
	System.out.println("Kindly enter a No. between 0 to 5");
	
    }
	finally
	{
		System.out.println("Okay");
	}




}}



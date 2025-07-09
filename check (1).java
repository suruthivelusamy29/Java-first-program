
import java.util.Scanner;
public class check
{
	public static void main(String[] args) {
	    System.out.println("Enter the details");
		Scanner m = new Scanner(System.in);
	  String name=m.nextLine();
	  String address=m.nextLine();
	  String city=m.nextLine();  
	  String Country=m.nextLine();
	  System.out.println("The details are");
	  System.out.print("Name is "+name+"\n"+"Address is "+address+"\n"+"city is "+city+"\n"+"Country is "+Country);
		
	}
}

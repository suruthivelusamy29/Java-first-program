
import java.util.Scanner;
public class check
{
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
	
		System.out.println("Enter the Number");
		int num=m.nextInt();
		if(num%2==0){
		    System.out.println("The number "+num+ " is even ");
		}
		else{
		    System.out.println("The number "+num +" is odd ");
		}
		
	}
}

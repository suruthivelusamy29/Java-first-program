import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
        int mark,sum=0;
        int i=1;
        float avg;
        while(i<=6) {
        	System.out.println("Enter the mark :");
        	mark=input.nextInt();
        	sum=sum+mark;
        	i++;
        }
        System.out.println("The sum of the total 6 marks is :"+sum);
        avg=sum/6;
        System.out.println("The Average is:"+avg);
	}

}
import java.io.*;
import java.util.Scanner;
class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int n = sc.nextInt();
        System.out.println("enter num2");
        int n1 = sc.nextInt();
        int n2 = n+n1;
        System.out.println("sum of numbers is " +n2);
        sc.nextLine();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("My name is "+name);
    }
}

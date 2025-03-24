package lecture01;

import java.util.Scanner;


public class userinput {
    public static void main(String[] args) {
        System.out.println("taking input by user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num1");
        int a =sc.nextInt();
        System.out.println("enter the num2");
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of no is " );
        System.out.println(sum);


    }
    
}

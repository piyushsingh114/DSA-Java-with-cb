package lecture01;
import java.util.Scanner;
public class precentage {
    public static void main(String[] args) {
        
        float total =500;
        System.out.println("Enter marks for 5 subjects: ");
        System.out.println("taking input by user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the maths");
        float a =sc.nextFloat();
        System.out.println("enter the Emft");
        float b =sc.nextFloat();
        System.out.println("enter the mpmc");
        float c =sc.nextFloat();
        System.out.println("enter the dc");
        float d =sc.nextFloat();
        System.out.println("enter the AE");
        float e =sc.nextFloat();
        
        float sum = a+b+c+d+e;
        System.out.println("your total marks is: ");
        System.out.println(sum);
        
        float percentage = (sum/total)*100;
        System.out.println("Marks Percentage is: ");
        System.out.print(percentage);
    }

   
    
    
}

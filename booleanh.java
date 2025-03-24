package lecture01;

import java.util.Scanner;
public class booleanh {
    
    public static void main(String[] args) {
        System.out.println("taking input km to miles");
                   Scanner sc =new Scanner(System.in);
                //    boolean b1 =sc.hasNextInt();
            //   System.out.println(b1);

                //       String str = sc.nextLine();
            //     System.out.println(str);
            float km = sc.nextFloat();
            float miles= (float) 0.6432;
            float multiply = km * miles;

        System.out.println("Ans Mile : " + multiply); 
    }}

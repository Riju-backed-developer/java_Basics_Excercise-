//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in ) ;
        int a , b, c ;
        System.out.print("enter three inputs : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c= sc.nextInt() ;
        float avg ;
        avg =(float) ( a+b+c) /3 ;
        System.out.print("the average is " + avg);


    }

}

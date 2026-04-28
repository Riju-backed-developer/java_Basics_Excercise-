//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;
public class SumOdd {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n , i,sum=0 ;

        System.out.print("Enter the value of n : ") ;
        n=sc.nextInt() ;
        for(i=1 ; i<= n ; i++){
            if((i%2 )!= 0){
               sum += i;

            }
        }
        System.out.print("The sum of odd numbers 1 to  " + n +" is " +sum);

    }
}

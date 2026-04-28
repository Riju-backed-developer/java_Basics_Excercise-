import java.util.Scanner ;
 class Greatest {
     int a, b ;

   static int Greatest(int a , int b){
         int max ;
         if(a>b)
             return a;
         else
             return b;

     }
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in) ;
         System.out.print("Enter 2 inputs: ");
        int a=sc.nextInt();
         int b= sc.nextInt();
//         int result = Greatest(a,b);
         System.out.print("the Greater is "+ Greatest(a,b) );    // without result


     }

}

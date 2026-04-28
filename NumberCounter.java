import java.util.Scanner ;
public class NumberCounter {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        int num;
        int pn=0,nn=0,zeros=0;
        char c ;
        do{
            System.out.print("Enter a number : ") ;
             num = sc.nextInt();
            if(num >0 ){
                pn++;
            }
            else  if(num <0)
            {
                nn++;
            }
            else {
                zeros++;
            }
            System.out.print("do you want to continue : (Y/N) ");
            c=sc.next().charAt(0);
        } while(c == 'Y' || c == 'y' ) ;
        System.out.println("\n Results : ");
        System.out.println("Positives Numbers : " + pn);
        System.out.println("Negetive Numbers: " + nn);
        System.out.println("Zeros : "+zeros);

    }

}

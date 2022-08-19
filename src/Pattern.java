import java.util.Scanner;

public class Pattern {

     public static void main(String[] args){

         Scanner in = new Scanner(System.in);
          int num = in.nextInt();
          for(int i= 1; i<num ;i++){
               for(int j=1; j<i; j++){
                    System.out.print("*");
                }
               System.out.println(" ");
          }

           for(int i=1; i<num ;i++){

               for(int j =i; j<num ;j++){
                   System.out.print("*");
               }
               System.out.println(" ");
           }

     }
}

// new code

import java.util.Scanner;

public class Square_Root {

   public static void main(String[] args) {

      
      double number = 0;
      double squareRoot = 0;

      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      number = scan.nextDouble();

      
      squareRoot = Math.sqrt(number);

      
      System.out.println("Square root "
		+ "value = "+ squareRoot + "," + "-"+ squareRoot);

      
      scan.close();
   }
}

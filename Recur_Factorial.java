import java.util.Scanner;
class Recur_Factorial
{
 public static void main(String args[])
{
 try
 {
 Scanner scanner = new Scanner(System.in);
 System.out.println("enter the number:");
 int num = scanner.nextInt();
 if(num<=0)
 {
     System.out.println("enter only positive numbers");
  }
 else
 {
 int factorial = fact(num);
 System.out.println("factorial of entered number is: "+factorial);
 }
}
 catch(Exception e)
 {
   System.out.println("enter only numbers");
  }
}



 static int fact(int n)
 {
 int output;
 if(n==1)
{
 return 1;
 }
 output = fact(n-1)* n;
 return output;
 }
}

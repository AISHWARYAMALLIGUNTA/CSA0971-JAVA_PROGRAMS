import java.util.*;
class perfectsquarenumber

{
 public static void main(String[] args)
 {
  try
 {
 Scanner scan;
 int num;
 
 scan = new Scanner(System.in);
 System.out.println("Decimal Number: ");
 num = Integer.parseInt(scan.nextLine());
 
 
 String binary = Integer.toBinaryString(num);
 System.out.println("Binary Number = " + binary);
 
 String octal = Integer.toOctalString(num);
 System.out.println("Octal = " + octal);
 }
 catch(Exception e)
  {
     System.out.println("Enter only numbers");
 }
}
}
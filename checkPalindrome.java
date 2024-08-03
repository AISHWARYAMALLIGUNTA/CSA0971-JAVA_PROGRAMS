import java.util.*;
class checkPalindrome
{
 public static void main(String[] args)
 {
   try
   {
    int a,rev=0,rem,choice;
    String a,b="";
    char c;
    int d=0,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Case:");
    choice=sc.nextInt();
    switch(choice)
    {
      case 1:
      {
         System.out.println("Enter the string:");
         a=sc.next();
         d=a.length();
	 for(i=d-1;i>=0;i--)
	 {
	    b=b+a.charAt(i);
	  }
         if(a.equals(b))
         {
            System.out.println("PALINDROME");
          }
         else
         {
             System.out.println("NOT A PALINDROME");
          }
        break;
      
      }
      case 2:
      {
         
             System.out.println("Enter a number:");
             a=sc.nextInt();
             int d1=a;
             while(a!=0)
             {
                rem=a%10;
                rev=rev*10+rem;
                a=a/10;
              }
             if(d1==rev)
             {
                
               System.out.println("PALINDROME");
             }
             else
            {
                
                System.out.println("NOT A PALINDROME");    
             }
            break;
       }
    }
   }
    
    catch(Exception e)
    {
        System.out.print("Enter only numbers");
    }
  }
}

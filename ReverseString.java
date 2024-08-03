import java.util.*;
class reverseString{
public static void main(String arg[]){
String a,b="";
int i,d=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
a=sc.nextLine();
d=a.length();
for(i=d-1;i>=0;i--){
b=b+a.charAt(i);
}
System.out.println("Reverse of string:"+b);
}
}
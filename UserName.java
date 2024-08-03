import java.util.*;
class UserName{
public static void main(String arg[]){
String s1,s2;
Scanner sc = new Scanner(System.in);
System.out.println("enter name:");
s1=sc.nextLine();
System.out.println("enter name again:");
s2=sc.nextLine();
if(s1.equals(s2)){
System.out.println("User name is valid");
}else{
System.out.println("User name is invalid");
}
}
}

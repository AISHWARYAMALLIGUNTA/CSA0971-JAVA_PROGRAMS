import java.util.*;
class countVowels{  
public static void main(String arg[]){
String a;
int i,vcount=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
a=sc.nextLine();
for(i=0;i<a.length();i++){
if((a.charAt(i)=='A')||(a.charAt(i)=='E')||(a.charAt(i)=='I')||(a.charAt(i)=='O')||(a.charAt(i)=='U')||
(a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u')){
vcount+=1;
}
}
System.out.println("number of vowels in " +a+ "  :"+vcount);
}
}
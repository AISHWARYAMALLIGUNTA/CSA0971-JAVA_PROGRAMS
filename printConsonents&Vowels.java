import java.util.*;
class printConsonents&Vowels{
public static void main(String arg[]){
String a,con="",vow="";
int i;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
a=sc.nextLine();
for(i=0;i<a.length();i++){
if((a.charAt(i)=='A')||(a.charAt(i)=='E')||(a.charAt(i)=='I')||(a.charAt(i)=='O')||(a.charAt(i)=='U')||(a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u')){
vow+=a.charAt(i);
}else{
con+=a.charAt(i);
}
System.out.println("vowels in string:"+vow);
System.out.println("consonats in string:"+con);

}
}
import java.util.*;
class skipNum{
public static void main(String arg[]){
int n,m,i,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter starting value:");
n=sc.nextInt();
System.out.println("Enter ending value:");
m=sc.nextInt();
System.out.println("Enter skipping number:");
s=sc.nextInt();
System.out.println("After Skipping "+s+":");
for(i=n;i<=m;i++){
if(i==s){
continue;
}else{
System.out.println(i);
}
}}}
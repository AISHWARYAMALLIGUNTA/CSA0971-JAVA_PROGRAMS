import java.util.*;
class countfactors{
public static void main(String arg[]){
int n,count=0,i,num;
int a[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
num=sc.nextInt();
for(i=1;i<=num;i++){
if(num%i==0){
a[count]=i;
count+=1;
}}
System.out.println("number of factors="+count);
System.out.println("enter n value:");
n=sc.nextInt();
System.out.println(n+"th factor of "+num+"=" + a[n-1]);
}}

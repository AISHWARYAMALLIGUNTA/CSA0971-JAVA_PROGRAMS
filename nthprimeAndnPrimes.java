import java.util.*;
class NprimeNum{
public static void main(String arg[]){
int n,count=0,i,j,num,fact;
int a[]=new int[100];
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
n=sc.nextInt();
for(i=2;i<=100;i++){
fact=0;
for(j=1;j<=i;j++){
if(i%j==0){
fact+=1;
}}
if(fact==2){
a[count]=i;
x+=1;
}}
System.out.println(n+"th prime number=" + a[n-1]);
System.out.print(n + " prime numbers after " + a[n - 1] + " are: ");
for(i=n;i<n+n;i++){
System.out.print(a[i]+" ");
}
}}

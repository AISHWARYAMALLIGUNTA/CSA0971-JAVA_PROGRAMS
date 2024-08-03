import java.util.*;
class TaxIncome{
public static void main(String arg[]){
try
{
int income,tax=0,Newincome=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter income:");
income=sc.nextInt();

if(income<0){
System.out.println("please enter positive numbers");
}

else if(income==0){
System.out.println("no tax");
}

else if(income>1000001){
tax=30*(income/100);
System.out.println("Tax="+tax);
Newincome=income-tax;
System.out.println("Taxable income:"+Newincome);
}

else if((500001<income)&&(income>1000000)){
tax=20*(income/100);
System.out.println("Tax="+tax);
Newincome=income-tax;
System.out.println("Taxable income:"+Newincome);
}

else if((250001<income)&&(income>50000)){
tax=10*(income/100);
System.out.println("Tax="+tax);
Newincome=(income-tax);
System.out.println("Taxable income:"+Newincome);
}

else{
tax=0;
System.out.println("Tax="+tax);
Newincome=(income-tax);
System.out.println("Taxable income:"+Newincome);
}
}catch(Exception e){
System.out.println("invalid");
}
}
}

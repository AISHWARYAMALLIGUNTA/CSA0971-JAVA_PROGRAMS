import java.util.Scanner;
public class pattern149162536496481100
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
System.out.print(k*k+" ");
                k++;
            }
            System.out.print("\n");
        }
    }
}

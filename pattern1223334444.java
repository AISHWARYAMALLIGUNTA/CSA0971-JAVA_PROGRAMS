import java.util.Scanner;
public class pattern1223334444
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // rows value from the user
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

import java.util.*;

class Allequal{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter three integers:");

        Integer n1, n2, n3;

        try {
            n1 = Integer.parseInt(sc.nextLine());
            n2 = Integer.parseInt(sc.nextLine());
            n3 = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        } finally {
            sc.close();
        }

        if ((n1==n2) && (n2==n3)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}


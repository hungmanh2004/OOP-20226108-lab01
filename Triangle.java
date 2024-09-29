import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            if(i == 0) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for(int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
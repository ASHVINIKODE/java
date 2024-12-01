import java.util.Scanner;

public class input_scanner {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        scn.close();
    }
}

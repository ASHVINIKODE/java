import java.util.Scanner;

public class trapezoidal {
    public static double f(double x) {
        return 1 / (1 + x * x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\t\t\tOUTPUT");
        System.out.println("\t\t\t\t\t******");
        System.out.println("Enter the value of upper limit and lower limit:");
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        System.out.println("Enter the number of subintervals:");
        int n = input.nextInt();
        double h = (b - a) / n;
        double s = 0;
        for (int i = 1; i < n - 1; i++) {
            s += f(a + i * h);
        }
        double t = (n / 2.0) * (f(a) + f(b) + 2 * s);
        System.out.println("The result is:%.4f", t);
        input.close();
    }
}

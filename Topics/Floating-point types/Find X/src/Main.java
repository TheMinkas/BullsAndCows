import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = 0;

        if (a <= 0) {
            System.out.println("Error");
            System.exit(0);
        } else {
            x = (c - b) / a;
            System.out.println(x);
        }
    }
}
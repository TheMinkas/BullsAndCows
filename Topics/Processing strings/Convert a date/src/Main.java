import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //String line = scanner.nextLine();
        String[] line = scanner.nextLine().split("-");
        System.out.println(line[1] + "/" + line[2] + "/" + line[0]);
    }
}
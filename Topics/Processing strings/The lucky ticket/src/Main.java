import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strArray[] = str.split("");
        int numArray[] = new int[strArray.length];
        for (int i=0; i<strArray.length; i++){
            numArray[i] =Integer.parseInt(strArray[i]);
        }
        if (numArray[0] + numArray[1] + numArray[2] == numArray[3] + numArray[4] + numArray[5]){
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}

import java.util.Scanner;

public class Reserve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split("");
        for (int i = number.length-1;i >= 0;i--){
            System.out.print(number[i]);
        }
    }
}

import java.util.Scanner;

public class baek8393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= a; i++){
            total = total + i;
        }
        System.out.println((total));
    }
}

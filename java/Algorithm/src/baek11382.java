import java.util.Scanner;

public class baek11382 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] stChange = a.split(" ");
        int total = 0;

        for (int i = 0; i < stChange.length; i++){
            total += Integer.parseInt(stChange[i]);
        }

        System.out.println(total);

    }
}

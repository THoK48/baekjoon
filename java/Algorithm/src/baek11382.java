import java.util.Scanner;

public class baek11382 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] stChange = a.split(" ");
        long total = 0;

        for (long i = 0; i < stChange.length; i++){
            total += Long.parseLong(stChange[Math.toIntExact(i)]);
        }

        System.out.println(total);

    }
}

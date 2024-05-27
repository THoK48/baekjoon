import java.util.Scanner;

public class baek10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine(); // nextInt() 후 남은 개행 문자를 소비
        int[] arr = new int[a];

        for (int i = 0; i < a; i++){
            String b = scanner.nextLine();
            String[] stChange = b.split(" ");
            arr[i] = Integer.parseInt(stChange[Math.toIntExact(0)]) + Integer.parseInt(stChange[Math.toIntExact(1)]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

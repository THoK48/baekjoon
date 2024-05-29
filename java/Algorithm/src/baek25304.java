import java.util.Scanner;

public class baek25304 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAmount = scanner.nextInt();
        int buyProdectCount = scanner.nextInt();
        scanner.nextLine(); // nextInt() 후 남은 개행 문자를 소비
        int total = 0;
        for (int i = 0; i < buyProdectCount; i++){
                String b = scanner.nextLine();
                String[] stChange = b.split(" ");
                int prodectAmount = Integer.parseInt(stChange[Math.toIntExact(0)]) * Integer.parseInt(stChange[Math.toIntExact(1)]);
                total = total + prodectAmount;

        }
        if (totalAmount == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

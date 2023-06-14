import java.util.Arrays;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("0부터 9까지 랜덤으로 돌릴 수를 입력 하세요.>> ");
        int num = scanner.nextInt();
        int[] arr = new int[10];

        for (int i = 0; i < num; i++) {
            int random = (int) (Math.random() * 10);
            arr[random] = arr[random] + 1;
        }

        System.out.println(Arrays.toString(arr));

        // 1000000000입력 시
        // [100003765, 99973519, 100016541, 99999669, 99995419, 100002758, 99995053, 100000187, 99986374, 100026715]
        scanner.close();
    }
}

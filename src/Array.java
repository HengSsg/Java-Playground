import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    }
}


class ArrayEx5 { // 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 예제
    public static void main(String[] args) {
        int sum = 0; // 총점을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length; // 계산 결과를 float로 얻기 위해서 형변환

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);
    }
}

class ArrayEx6 { // 저장된 값 중에서 최대값과 최소값을 구하는 예제
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}

class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}

class ArrayEx10 { // 길이가 10인 배열에 0과 9사이의 임의의 값으로 채운 다음, 버블정렬 알고리즘을 통해서 크기순으로 정렬
    public static void main(String[] args) {
        int count = 10;
        int[] numArr = new int[count];

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i] = (int) (Math.random() * 100));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false; //자리바꿈이 발생했는지를 체크한다.

            for (int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) { //옆의 값이 작으면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true;
                }
            }

            if (!changed) break;

            for (int k = 0; k < numArr.length; k++)
                System.out.println(numArr[k]);
            System.out.println();
        }
    }

}

class MultiArrEx1 { // 2차원 배열을 이용해서 1 찾기 게임
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = new byte[SIZE][SIZE];

        // 배열 생성
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int random = (int)(Math.random() * 2);
                shipBoard[i][j] = (byte) random;
            }
        }
        // 1행에 행번호를, 1열에 열번호를 저장한다.
        for (int i = 1; i < SIZE; i++)
            board[0][i] = board[i][0] = (char) (i + '0');

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine(); // 화면에 입력받은 내용을 input에 저장

            if(input.length()  == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if(x==0 &&  y==0)
                    break;
            }

            if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >=SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

            for (int i = 0; i < SIZE; i++) {
                System.out.println(board[i]);
            }
            System.out.println();
        }
    }
}
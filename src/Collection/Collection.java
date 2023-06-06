package Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {

    /**
     * ArrayList에 요소를 추가하고, 반복문을 사용하여 모든 요소를 출력하는 코드를 작성해보세요.
     * HashSet에 중복되지 않는 랜덤한 숫자 10개를 추가하는 코드를 작성해보세요.
     * LinkedList에 "A", "B", "C"라는 요소를 순서대로 추가하고, 처음과 마지막 요소를 출력하는 코드를 작성해보세요.
     * HashMap에 "사과"를 키로 하고 "Apple"을 값으로 가지는 요소를 추가하고, 키를 사용하여 값을 출력하는 코드를 작성해보세요.
     * TreeMap에 "C"를 키로 하고 "Cat"을 값으로 가지는 요소를 추가하고, 모든 키-값 쌍을 반복문을 사용하여 출력하는 코드를 작성해보세요.
     */

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.arrayListQuiz();
    }

    void arrayListQuiz() {
        ArrayList ranNum = new ArrayList();

        // 난수 저장
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            ranNum.add(random);
        }
        // 출력
        for (int i = 0; i < ranNum.size(); i++) {
            System.out.println(ranNum.get(i));
        }

    }

}

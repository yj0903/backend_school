
// 채유진
// 미니프로젝트 Quiz 6 - 대선
// https://gist.github.com/yj0903/4b150ace9c00aef55b40f5130325be0b

import java.util.HashMap;
import java.util.Random;

public class Quiz6 {

    public static int voteFunction(HashMap pList){
        Random random = new Random();

        int people = 10000; //투표인원
        int[] pResult = new int[5]; // 개표현황 담을 배열 선언

        // 랜덤 투표 진행
        for (int i = 1; i <= people; i++) {
            int pick= random.nextInt(4)+1;
            pResult[pick] +=1;

            // 진행상황 출력
            System.out.printf("[투표진행율]: %.02f%%, %d명 투표 => %s\n", (float)i/people*100, i, pList.get(pick));
            System.out.printf("[기호:%d] %s: %.2f%% (투표수: %d)\n", 1, pList.get(1), (float)pResult[1]/people*100, pResult[1]);
            System.out.printf("[기호:%d] %s: %.2f%% (투표수: %d)\n", 2, pList.get(2), (float)pResult[2]/people*100, pResult[2]);
            System.out.printf("[기호:%d] %s: %.2f%% (투표수: %d)\n", 3, pList.get(3), (float)pResult[3]/people*100, pResult[3]);
            System.out.printf("[기호:%d] %s: %.2f%% (투표수: %d)\n\n", 4, pList.get(4), (float)pResult[4]/people*100, pResult[4]);
        }

        int max = 0;
        int president = -1; // 당선

        for (int i = 1; i < 5; i++) {
            if (pResult[i] > max) {
                max = pResult[i];
                president = i;
            } else if (pResult[i] == max) {
                return -1;
            }
        }
        return president;
    }
    public static void main(String[] args) {

        //후보자리스트 해시맵 선언
        HashMap<Integer, String> pList = new HashMap<>();
        pList.put(1, "이재명");
        pList.put(2, "윤석열");
        pList.put(3, "심상정");
        pList.put(4, "안철수");

        // 투표는 동율 아닐 때까지 반복
        while (true) {
            int result = voteFunction(pList);
            // 동율 아니면 결과 출력
            if (result != -1) {
                System.out.printf("[투표결과] 당선인: %s", pList.get(result));
                break;
            }
            System.out.println("==========동율-재투표 진행==============");
        }
    }
}

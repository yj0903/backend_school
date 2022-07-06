import java.util.*;

// 채유진
// 미니프로젝트 Quiz 7 - 로또
// https://gist.github.com/yj0903/141f1669fe60e7197375864d3c325920

public class Quiz7 {
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해주세요. (숫자 1~10): ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 11) {
            System.out.println("[경고] 로또는 최대 10개까지 구매 가능합니다.");
            return;
        }

        HashMap mapList = new HashMap();


        for (int i = 0; i < n; i++) {
            HashSet lSet = new HashSet();

            for (int j = 0; lSet.size() < 6; j++) {
                int num = (int)(Math.random() * 45) + 1;
                lSet.add(num);
            }

            LinkedList list = new LinkedList(lSet); // 데이터타입 set -> list 변환
            Collections.sort(list); //정렬
            System.out.printf("%c\t %s\n", 'A'+i ,list);
            mapList.put(i,list);
        }



        // 로또 발표
        HashSet<Integer> lottoSet = new HashSet();
        for (; lottoSet.size() < 6;) {
            int num = (int)(Math.random() * 45) + 1;
            lottoSet.add(num);
        }
        // 데이터타입 set -> list 변환 : 정렬하기 위해.
        LinkedList lottoList = new LinkedList(lottoSet);
        Collections.sort(lottoList);
        System.out.println("\n[로또 발표]:\n" + lottoList);



        System.out.println("\n[내 로또 결과]");

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            LinkedList l = (LinkedList) mapList.get(i);
            for (int j = 0; j < lottoList.size(); j++) {
                if (l.contains(lottoList.get(j))) {
//                    System.out.print(lottoList.get(j)+" ");
                    cnt += 1;
                }
            }
            System.out.printf("%c\t%s\t=>\t%d개 일치\n",'A'+i,l,cnt);
        }

    }
}

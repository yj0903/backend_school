
// 채유진
// 미니프로젝트 Quiz 5 - 달력
// https://gist.github.com/yj0903/8022b975eb0c713e67cd91c2e4d0b4ab

import java.time.LocalDate;
import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해주세요. (yyyy): ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.print("달력의 월을 입력해주세요. (mm): ");
        int month = Integer.parseInt(sc.nextLine());

        System.out.printf("\n\n[%d년 %02d월]\n", year, month);
        System.out.print("일\t월\t화\t수\t목\t금\t토\n");

        LocalDate date = LocalDate.of(year, month, 1);


        int monthLen = date.lengthOfMonth(); //28일,29일,30일,31일 중
        int startWeek = date.getDayOfWeek().getValue()%7; // 일월화수목금토(0,1,2,3,4,5,6)
        int cnt = 1;

        for (int i = 1; cnt <= monthLen; i++) {

            // 요일에 맞게 앞 부분은 공백 추가
            if (startWeek != 0) {
                System.out.print(" \t");
                startWeek -= 1;
            } else {
                System.out.printf("%02d\t", cnt);
                cnt += 1;
            }

            // 주차별로 줄바꿈 추가
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }
}


// 채유진
// 미니프로젝트 Quiz 1
// https://gist.github.com/yj0903/06060a7ba0bc092b10bac57135b2e4de

public class Quiz1 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10 ; j++) {
//                System.out.printf("%02d X %02d = %02d\t", j,i,j*j);
                String s = String.format("%02d X %02d = %02d\t", j, i, j * j);
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

// Practice4
// 배열 arr 에서 peek 값 모두 출력

// 입출력 예시)
// arr: 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
// 결과: 3, 6, 5, 10, 11

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        for (int i = 0; i < arr.length; i++) {
            //0번 인덱스는 오른쪽만 확인하면 됨
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
            // 마지막 인덱스는 왼쪽만 확인하면 됨
            else if (i == arr.length - 1 && arr[i - 1] < arr[i]) {
                System.out.print(arr[i] + " ");
            }
            // 그외는 좌우 인덱스 확인해야 함.
            else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

}

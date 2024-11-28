// 알고리즘 - 이진 탐색
// 변경 한번 할게~~~
// 두번째 변경 할게~~
// custom 에서 변경
// Main 은 계속적으로 새 브랜치 영향ㅇ 없이 진행
// Main 은 그대로 진행중
// 새로운 기능입니다~
class Main {
    // 반복문 구조
    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid -1; // 중앙값을 제외 한 왼쪽 덩어리;
            } else if (target > arr[mid]) {
                left = mid + 1;
            }
        }

        return -1; // 찾으려는 데이터가 없다는 뜻으로 -1을 출력해준다.
    }
    
    // 재귀 호출 구조
    public static int binarySearch2(int[] arr, int target, int left, int right) {
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};

        System.out.println("Index: " + binarySearch(arr, 30));
        System.out.println();

        System.out.println("Index: " + binarySearch2(arr, 30, 0, arr.length - 1));
    }
}// 이 부분에 충돌을 만들거야!

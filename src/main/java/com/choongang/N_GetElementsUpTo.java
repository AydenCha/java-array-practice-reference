package com.choongang;

public class N_GetElementsUpTo {
    public int[] getElementsUpTo(int[] arr, int n) {
        // n이 배열 길이 이상이면 빈 배열을 리턴합니다(문제의 규칙).
        if (n >= arr.length) {
            return new int[]{};
        }

        // 0번부터 n - 1번까지, 모두 n개의 요소를 담습니다.
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // 참고: Arrays.copyOfRange(arr, 0, n) 한 줄로도 같은 배열을 만들 수 있습니다.
    // Arrays의 유틸 메서드는 컬렉션 토픽에서 다룹니다.
}

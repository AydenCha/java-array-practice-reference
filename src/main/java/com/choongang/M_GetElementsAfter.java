package com.choongang;

public class M_GetElementsAfter {
    public int[] getElementsAfter(int[] arr, int n) {
        // n이 배열 길이 이상이면 담을 요소가 없으므로 빈 배열을 리턴합니다.
        if (n >= arr.length) {
            return new int[]{};
        }

        // n번 인덱스부터 끝까지의 개수는 arr.length - n입니다.
        int[] result = new int[arr.length - n];
        for (int i = n; i < arr.length; i++) {
            // arr의 n번 요소가 result의 0번 칸에 들어가야 하므로 인덱스에서 n을 뺍니다.
            result[i - n] = arr[i];
        }
        return result;
    }

    // 참고: Arrays.copyOfRange(arr, n, arr.length) 한 줄로도 같은 배열을 만들 수 있습니다.
    // Arrays의 유틸 메서드는 컬렉션 토픽에서 다룹니다.
}

package com.choongang;

public class K_AddToBack {
    public int[] addToBack(int[] arr, int el) {
        // 한 칸 더 긴 새 배열을 만들고, arr의 요소를 같은 자리로 옮깁니다.
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        // 마지막 칸(인덱스 arr.length)에 el을 넣습니다.
        result[arr.length] = el;
        return result;
    }

    // 참고: 위의 반복문은 System.arraycopy(arr, 0, result, 0, arr.length); 한 줄로도 쓸 수 있습니다.
}

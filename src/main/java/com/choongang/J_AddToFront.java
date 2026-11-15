package com.choongang;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        // 한 칸 더 긴 새 배열을 만들고, 맨 앞 칸에 el을 넣습니다.
        int[] result = new int[arr.length + 1];
        result[0] = el;

        // arr의 i번 요소를 result의 i + 1번 칸으로 옮깁니다.
        for (int i = 0; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    // 참고: 위의 반복문은 System.arraycopy(arr, 0, result, 1, arr.length); 한 줄로도 쓸 수 있습니다.
}

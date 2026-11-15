package com.choongang;

public class L_MergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // 두 배열의 길이를 더한 크기로 새 배열을 만듭니다.
        int[] result = new int[arr1.length + arr2.length];

        // arr1의 요소를 앞에서부터 담습니다.
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // arr2의 요소는 arr1이 끝난 다음 칸(인덱스 arr1.length)부터 담습니다.
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    // 참고: 두 반복문은 각각 System.arraycopy 한 줄로도 쓸 수 있습니다.
}

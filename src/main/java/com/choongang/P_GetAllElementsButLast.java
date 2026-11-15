package com.choongang;

public class P_GetAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        // 빈 배열이면 뺄 요소가 없으므로 빈 배열을 리턴합니다.
        if (arr.length == 0) {
            return new int[]{};
        }

        // 마지막 요소를 뺀 나머지이므로 길이는 arr.length - 1입니다.
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // 참고: Arrays.copyOfRange(arr, 0, arr.length - 1) 한 줄로도 같은 배열을 만들 수 있습니다.
    // Arrays의 유틸 메서드는 컬렉션 토픽에서 다룹니다.
}

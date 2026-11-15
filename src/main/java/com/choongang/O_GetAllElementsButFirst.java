package com.choongang;

public class O_GetAllElementsButFirst {
    public int[] getAllElementsButFirst(int[] arr) {
        // 빈 배열이면 뺄 요소가 없으므로 빈 배열을 리턴합니다.
        if (arr.length == 0) {
            return new int[]{};
        }

        // 첫 요소를 뺀 나머지이므로 길이는 arr.length - 1입니다.
        int[] result = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            // arr의 1번 요소가 result의 0번 칸에 들어갑니다.
            result[i - 1] = arr[i];
        }
        return result;
    }

    // 참고: Arrays.copyOfRange(arr, 1, arr.length) 한 줄로도 같은 배열을 만들 수 있습니다.
    // Arrays의 유틸 메서드는 컬렉션 토픽에서 다룹니다.
}

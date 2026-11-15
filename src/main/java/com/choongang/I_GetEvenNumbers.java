package com.choongang;

public class I_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // 1. 짝수가 몇 개인지 먼저 셉니다. 배열은 만들 때 길이를 정해야 하기 때문입니다.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        // 2. 센 개수만큼의 배열을 만들고, 짝수를 앞에서부터 차례로 담습니다.
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        // 짝수가 없으면 count가 0이라서 빈 배열이 리턴됩니다.
        return result;
    }

    // 참고: 짝수를 만날 때마다 Arrays.copyOf로 배열을 한 칸씩 늘려 담는 방법도 있습니다.
    // Arrays의 유틸 메서드는 컬렉션 토픽에서 다룹니다.
}

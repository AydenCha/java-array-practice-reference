package com.choongang;

public class R_CreatePhoneNumber {
    public String createPhoneNumber(int[] arr) {
        // 길이가 8이면 앞의 세 자리를 "010"으로 채웁니다.
        // 길이가 11이면 앞의 세 자리를 arr에서 가져옵니다.
        String head = "";
        int start = 0;
        if (arr.length == 8) {
            head = "010";
        } else {
            for (int i = 0; i < 3; i++) {
                head = head + arr[i];
            }
            start = 3;
        }

        // 나머지 8자리 가운데 앞의 네 자리와 뒤의 네 자리를 나눠 이어 붙입니다.
        // 문자열에 int를 더하면 숫자가 문자열로 바뀌어 이어 붙습니다.
        String body = "";
        for (int i = start; i < start + 4; i++) {
            body = body + arr[i];
        }
        String tail = "";
        for (int i = start + 4; i < arr.length; i++) {
            tail = tail + arr[i];
        }

        return "(" + head + ")" + body + "-" + tail;
    }
}

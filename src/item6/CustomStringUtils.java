package item6;

import java.util.regex.Pattern;

public class CustomStringUtils {

    //가장 단순한 방법이지만, 반복적으로 사용하기에는 성능 이슈가 발생
    static boolean isNumber(String s) {
        return s.matches("[0-9]]");
    }

    private static final Pattern NUMBER = Pattern.compile("[0-9]]");

    static boolean isNumberImprove(String s) {
        return NUMBER.matcher(s).matches();
    }
}

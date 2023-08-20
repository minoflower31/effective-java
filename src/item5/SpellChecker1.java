package item5;

import java.util.Collections;
import java.util.List;

/**
 * - 정적 유틸리티를 잘못 사용 - 1
 * - 유연하지 않고 테스트하기 어려움
 */

public class SpellChecker1 {

    private static final Dictionary dictionary = new Dictionary();

    private SpellChecker1() {}

    public static boolean isValid(String word) {
        return false;
    }

    public static List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}

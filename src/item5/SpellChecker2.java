package item5;

import java.util.Collections;
import java.util.List;

/**
 * - 싱글턴을 잘못 사용 - 2
 * - 유연하지 않고 테스트하기 어려움
 */

public class SpellChecker2 {

    private static final Dictionary dictionary = new Dictionary();

    private SpellChecker2() {}

    public static SpellChecker2 INSTANCE = new SpellChecker2();

    public static boolean isValid(String word) {
        return false;
    }

    public static List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}

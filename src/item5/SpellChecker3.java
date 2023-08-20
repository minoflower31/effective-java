package item5;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * - 의존 관계 주입
 * - 유연성과 테스트 용이성을 높여줌
 */

public class SpellChecker3 {

    private final Dictionary dictionary;

    public SpellChecker3(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) {
        return false;
    }

    public static List<String> suggestions(String typo) {
        return Collections.emptyList();
    }
}

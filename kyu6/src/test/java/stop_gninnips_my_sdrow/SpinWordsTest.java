package stop_gninnips_my_sdrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("# SpinWords class's")
public class SpinWordsTest {
    @Nested
    @DisplayName("spinWords method")
    class Describe_spinWords {
        @Nested
        @DisplayName("With sentence has only under 5letters word")
        class Context_with_sentence_has_only_under_5letters_word {
            @Test
            @DisplayName("Should return same sentence.")
            void it_return_sum_of_numbers_multiples_of_3_or_5() {
                assertEquals(new SpinWords().spinWords(""), "");
                assertEquals(new SpinWords().spinWords("Hi"), "Hi");
                assertEquals(new SpinWords().spinWords("This is a test"), "This is a test");
            }
        }

        @Nested
        @DisplayName("With sentence has over 4letters word")
        class Context_with_sentence_has_over_4letters_word {
            @Test
            @DisplayName("Should return sentence reverses all over 4letters.")
            void it_return_sum_of_numbers_multiples_of_3_or_5() {
                assertEquals(new SpinWords().spinWords("Hey fellow warriors"), "Hey wollef sroirraw");
                assertEquals(new SpinWords().spinWords("Hello"), "olleH");
            }
        }
    }
}

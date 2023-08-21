package multiples_of_3_or_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Nested
    @DisplayName("# Multiples of 3 or 5")
    class Describe_multiples_of_3_or_5 {
        @Nested
        @DisplayName("With postive number")
        class Context_with_positibe_number {
            @Test
            @DisplayName("Should return sum of number's mulitples of 3 or 5")
            void it_return_sum_of_numbers_multiples_of_3_or_5() {
                assertEquals( new Solution().solution(3), 0, "3[] => 0");
                assertEquals(new Solution().solution(8), 14, "8[3, 5, 6] => 14");
                assertEquals(new Solution().solution(10), 23, "10[3, 5, 6, 9] => 23");
            }
        }

        @Nested
        @DisplayName("With boundary condition cases")
        class Context_with_boundary_condition {
            @Test
            @DisplayName("Should return sum of number's mulitples of 3 or 5")
            void it_return_sum_of_numbers_multiples_of_3_or_5() {
                assertEquals( new Solution().solution(1), 0, "1[] => 0");
                assertEquals(new Solution().solution(0), 0, "0[] => 0");
            }
        }

        @Nested
        @DisplayName("With negative number")
        class Context_negative_number {
            @Test
            @DisplayName("Should always return 0")
            void it_always_return_0() {
                assertEquals( new Solution().solution(-1), 0, "negative number always return 0");
                assertEquals(new Solution().solution(-10), 0, "negative number always return 0");
            }
        }
    }
}

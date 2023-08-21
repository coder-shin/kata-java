package multiples_of_3_or_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(final int number) {
        return this.sum(this.filterMultiplesOf3or5(number));
    }

    private int[] filterMultiplesOf3or5(final int number) {
        return Arrays.stream(this.range(number)).filter(n -> n % 3 == 0 || n % 5 == 0).toArray();
    }

    private int[] range(final int number) {
        return IntStream.range(0, number).toArray();
    }

    private int sum(final int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}

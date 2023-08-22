package stop_gninnips_my_sdrow;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords {
    public String spinWords(String sentence) {
        Stream<String> splitWord = splitWithSpace(sentence);
        Stream<String> longWordsReversed = reverseOver4LetterWords(splitWord);
        return joinWithSpace(longWordsReversed);
    }

    private Stream<String> splitWithSpace(String sentence) {
        return Arrays.stream(sentence.split(" "));
    }

    private Stream<String> reverseOver4LetterWords(Stream<String> words) {
        return words.map(this::reverseWordIfOver4Letter);
    }

    private String joinWithSpace(Stream<String> words) {
        return words.collect(Collectors.joining(" "));
    }

    private String reverseWordIfOver4Letter(String word) {
        if (word.length() > 4) {
            return this.reverseWord(word);
        } else {
            return word;
        }
    }

    private String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}

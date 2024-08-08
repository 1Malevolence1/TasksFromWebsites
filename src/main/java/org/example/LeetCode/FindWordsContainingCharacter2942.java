package org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindWordsContainingCharacter2942 {
    public static void main(String[] args) {

    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> findItem = new ArrayList<>();
        for (int word = 0; word < words.length; word++) {
            if(words[word].indexOf(x) != -1) findItem.add(word);
        }
        return findItem;
    }

    public List<Integer> findWordsContainingStream(String[] words, char x) {

        return IntStream.iterate(0, i -> i +1).limit((words.length)).filter(i -> words[i].indexOf(x) != -1).boxed().toList();
    }
}

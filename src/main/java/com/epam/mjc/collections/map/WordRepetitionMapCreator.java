package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.");
        while (tokenizer.hasMoreTokens()) {
            String str = tokenizer.nextToken().toLowerCase();
            map.putIfAbsent(str, 0);
            map.replace(str, map.get(str) + 1);
        }

        return map;
    }
}

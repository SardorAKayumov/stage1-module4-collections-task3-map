package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            map.putIfAbsent(entry.getValue(), entry.getKey());
            if(entry.getKey() < map.get(entry.getValue()))
                map.replace(entry.getValue(), entry.getKey());
        }

        return map;
    }
}

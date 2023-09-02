package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> keySet = sourceMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            if (!result.containsKey(key.length())) {
                result.put(key.length(), new HashSet<String>());
            }
            result.get(key.length()).add(key);
        }
        return result;
    }
}

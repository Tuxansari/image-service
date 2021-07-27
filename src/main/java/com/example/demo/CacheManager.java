package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    public static Map<String, String> cache = new HashMap<>();

    public static void add(String key, String value) {
        cache.put(key, value);
    }

    public static String get(String key) {
        return cache.get(key);
    }
}

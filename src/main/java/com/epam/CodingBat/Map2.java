package com.epam.CodingBat;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 13.12.2017.
 */
public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> answer = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if (!answer.containsKey(strings[i]))
                answer.put(strings[i], 0);
        }
        return answer;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> answer = new HashMap<String, Integer>();
        for (String tmp : strings) {
            answer.put(tmp, tmp.length());
        }
        return answer;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> answer = new HashMap<String, String>();
        for (String tmp : strings) {
            answer.put(tmp.substring(0, 1), tmp.substring(tmp.length() - 1, tmp.length()));
        }
        return answer;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> answer = new HashMap<String, Integer>();
        for (String tmp : strings) {
            if (!answer.containsKey(tmp))
                answer.put(tmp, 1);
            else answer.replace(tmp, answer.get(tmp) + 1);
        }
        return answer;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> answer = new HashMap<String, String>();
        for (String tmp : strings) {
            String first = tmp.substring(0, 1);
            if (!answer.containsKey(first))
                answer.put(first, tmp);
            else answer.replace(first, answer.get(first) + tmp);
        }
        return answer;
    }

    public String wordAppend(String[] strings) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.replace(strings[i], map.get(strings[i]) + 1);
                if (map.get(strings[i]) % 2 == 0) {
                    answer += strings[i];
                }
            } else map.put(strings[i], 1);
        }
        return answer;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], false);
            } else map.put(strings[i], true);
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String tmp;
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].substring(0, 1)) || map.get(strings[i].substring(0, 1)) == strings.length) {
                map.put(strings[i].substring(0, 1), i);
            } else if (map.get(strings[i].substring(0, 1)) != strings.length) {
                tmp = strings[i];
                strings[i] = strings[map.get(strings[i].substring(0, 1))];
                strings[map.get(strings[i].substring(0, 1))] = tmp;
                map.put(strings[i].substring(0, 1), strings.length);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String tmp;
        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i].substring(0, 1)) ) {
                map.put(strings[i].substring(0, 1), i);
            } else if (map.get(strings[i].substring(0, 1)) != -1) {
                tmp = strings[i];
                strings[i] = strings[map.get(strings[i].substring(0, 1))];
                strings[map.get(strings[i].substring(0, 1))] = tmp;
                map.put(strings[i].substring(0, 1), -1);
            }
        }
        return strings;
    }
}

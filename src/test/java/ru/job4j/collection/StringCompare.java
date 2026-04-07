package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            char cLeft = left.charAt(i);
            char cRight = right.charAt(i);
            if (cLeft != cRight) {
                return Character.compare(cLeft, cRight);
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}

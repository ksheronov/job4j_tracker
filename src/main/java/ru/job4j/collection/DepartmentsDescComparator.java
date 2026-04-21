package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String a1 = left.split("/")[0];
        String a2 = right.split("/")[0];
        int result = a2.compareTo(a1);
        if (result != 0) {
            return result;
        }
        return left.compareTo(right);
    }
}
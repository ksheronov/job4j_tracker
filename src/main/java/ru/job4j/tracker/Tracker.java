package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] findName = new Item[size];
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                findName[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(findName, count);
    }

    public Item[] findAll() {
        int count = 0;
        Item[] notNull = new Item[size];
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                notNull[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(notNull, count);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index].setName(item.getName());
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            int startPos = index + 1;
            System.arraycopy(items, startPos, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}
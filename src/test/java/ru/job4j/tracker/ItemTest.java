package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
    @Test
    public void whenItemDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Oleg"));
        items.add(new Item("Petr"));
        items.add(new Item("Timofei"));
        items.add(new Item("Konstantin"));
        List<Item> expected = Arrays.asList(
                new Item("Timofei"),
                new Item("Petr"),
                new Item("Oleg"),
                new Item("Konstantin")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemAskByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Oleg"));
        items.add(new Item("Petr"));
        items.add(new Item("Timofei"));
        items.add(new Item("Konstantin"));
        List<Item> expected = Arrays.asList(
                new Item("Konstantin"),
                new Item("Oleg"),
                new Item("Petr"),
                new Item("Timofei")
        );
        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }
}
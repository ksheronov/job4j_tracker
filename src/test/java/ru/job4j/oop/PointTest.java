package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double rsl = a.distance(b);
        assertThat(rsl).isCloseTo(4, offset(0.001));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(4, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl).isCloseTo(4.47, offset(0.01));
    }
}
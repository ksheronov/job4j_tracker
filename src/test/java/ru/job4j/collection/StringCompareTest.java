package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void charLeftAndRightIsDigitShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "12345",
                "123456"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void charLeftAndRightIsDigitShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "12345",
                "1234"
        );
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void charLeftAndRightIsDigitShouldBeEquals() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "12345",
                "12345"
        );
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void firstCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "1Petrova",
                "2Petrova"
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void firstCharOfLeftEqualsRightShouldBeEquals() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "1Petrova",
                "1Petrova"
        );
        assertThat(result).isEqualTo(0);
    }

}
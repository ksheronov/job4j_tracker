package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"744"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(744);
    }

    @Test
    void whenValidMultiplyInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"744", "1", "2", "4"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int[] expected = {744, 1, 2, 4};
        for (int j : expected) {
            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(j);
        }
    }

    @Test
    void whenValidMinusInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-5"}
        );
        ValidateInput input = new ValidateInput(output, in);

            int selected = input.askInt("Enter menu:");
            assertThat(selected).isEqualTo(-5);
    }
}
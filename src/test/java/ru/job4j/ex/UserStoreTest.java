package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;
import static ru.job4j.ex.UserStore.findUser;
import static ru.job4j.ex.UserStore.validate;

public class UserStoreTest {

    @Test
    public void whenUserNotFound() {
        UserNotFoundException exception = assertThrows(
                UserNotFoundException.class,
                () -> {
                    User[] users = {
                            new User("Petr Arsentev", true)
                    };
                    findUser(users, "Petr Arsen");
                });
        assertThat(exception.getMessage()).isEqualTo("User Petr Arsen not found");
    }

    @Test
    public void whenUserIsNotValidName() {
        UserInvalidException exception = assertThrows(
                UserInvalidException.class,
                () -> {
                    User user = new User("P", true);
                    validate(user);
                });
        assertThat(exception.getMessage()).isEqualTo("User not valid P");
    }

    @Test
    public void whenUserIsNoValId() {
        UserInvalidException exception = assertThrows(
                UserInvalidException.class,
                () -> {
                    User user = new User("Petr", false);
                    validate(user);
                });
        assertThat(exception.getMessage()).isEqualTo("User not valid Petr");
    }

    @Test
    public void whenUserIsValid() throws UserInvalidException {
        User user = new User("Petr", true);
        boolean result = validate(user);
        assertThat(result).isTrue();

    }

    @Test
    public void whenUserIsFound() throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Ivan Petrov", true)
        };
        User user = findUser(users, "Petr Arsentev");
        String result = user.getUsername();
        String expected = "Petr Arsentev";
        assertThat(result).isEqualTo(expected);
    }
}
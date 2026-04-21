package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Сервис для управления пользователями банка и их счетами.
 * Позволяет добавлять и удалять пользователей, добавлять счета,
 * искать пользователя по паспорту, искать счет по реквизитам
 * и переводить деньги между счетами.
 *
 * @author Konstantin Sheronov
 * @version 1.0
 */

public class BankService {
    /**
     * Хранилище пользователей и их счетов осуществляется в коллекции типа Map.
     * Ключ - пользователь {@code User}, значение — список его счетов, которые хранятся в коллекции List {@code Account}
     *
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавления пользователя в сервис.
     * Если пользователь уже существует, ничего не делает.
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаления пользователя по паспорту.
     *
     * @param passport паспорт пользователя
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод добавления счета пользователю.
     * Если пользователь не найден, счет не добавляется.
     * Если такой счет уже существует, повторное добавление не выполняется.
     *
     * @param passport паспорт пользователя
     * @param account  счет для добавления
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            if (!accounts.contains(account)) {
                accounts.add(account);

            }
        }
    }

    /**
     * Данный метод ищет пользователя по паспорту.
     *
     * @param passport паспорт пользователя
     * @return найденный пользователь или {@code null}, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам:
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты счета
     * @return найденный счет или {@code null}, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * Перевод выполняется только если оба счета найдены и
     * на исходном счете достаточно средств.
     *
     * @param sourcePassport       паспорт отправителя
     * @param sourceRequisite      реквизиты счета отправителя
     * @param destinationPassport  паспорт получателя
     * @param destinationRequisite реквизиты счета получателя
     * @param amount               сумма перевода
     * @return {@code true}, если перевод выполнен успешно; {@code false} в противном случае
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount == null || destinationAccount == null || sourceAccount.getBalance() < amount) {
            return false;
        }
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        return true;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
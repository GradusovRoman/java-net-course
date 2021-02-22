package ru.daniilazarnov.storage;

public interface UserStorage {
    boolean findUser(String login, String password);

    void  addUser(String login, String password);
}
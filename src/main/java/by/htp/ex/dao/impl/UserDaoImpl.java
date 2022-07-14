package by.htp.ex.dao.impl;

import by.htp.ex.bean.User;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private Map<String, User> userCards = new HashMap<>();

    @Override
    public void addUserCard(User user) throws DaoException {
        try {
            userCards.put(user.getEmail(), user);
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }

    @Override
    public User getUserCard(String email) throws DaoException {
        try {
            return userCards.get(email);
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
}

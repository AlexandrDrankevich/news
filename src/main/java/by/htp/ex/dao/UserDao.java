package by.htp.ex.dao;

import by.htp.ex.bean.User;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public interface UserDao {
     void addUserCard(User user) throws DaoException;
     User getUserCard(String email) throws DaoException;
}

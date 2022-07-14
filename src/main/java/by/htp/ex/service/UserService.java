package by.htp.ex.service;

import by.htp.ex.bean.User;

public interface UserService {
boolean authorization(String login, String password) throws ServiceException;
boolean registration(User user) throws ServiceException;
}

package by.htp.ex.service.impl;

import by.htp.ex.bean.User;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        try {
            User userCard = DaoProvider.getInstance().getUserDao().getUserCard(login);
            if (userCard == null || !userCard.getPassword().equals(password)) {
                return false;
            } else return true;

        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean registration(User user) throws ServiceException {
        try {
            DaoProvider.getInstance().getUserDao().addUserCard(user);
            return true;
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }
}

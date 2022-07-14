package by.htp.ex.service.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.dao.UserDao;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = DaoProvider.getInstance().getUserDao();

    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        try {
          return  userDao.authorization(login,password);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean registration(NewUserInfo user) throws ServiceException {
        try {
        return  userDao.registration(user);
                } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }
}

package by.htp.ex.service.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.DaoProvider;
import by.htp.ex.dao.UserDao;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.UserService;
import by.htp.ex.util.validation.UserDataValidation;
import by.htp.ex.util.validation.ValidationProvider;

public class UserServiceImpl implements UserService {
    UserDao userDao = DaoProvider.getInstance().getUserDao();
    UserDataValidation userDataValidation=ValidationProvider.getInstance().getUserDataValidation();

    @Override
    public boolean authorization(String login, String password) throws ServiceException {
        if(!userDataValidation.checkAuthData(login,password)){
            throw new ServiceException("invalid login or password");
        }
        try {
            return userDao.authorization(login, password);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean registration(NewUserInfo user) throws ServiceException {
        if(!userDataValidation.checkRegData(user)){
            throw new ServiceException("invalid registration data");
        }
        try {
            return userDao.registration(user);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }
}

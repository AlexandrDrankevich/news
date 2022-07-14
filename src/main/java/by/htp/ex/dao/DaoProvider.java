package by.htp.ex.dao;

import by.htp.ex.dao.impl.UserDaoImpl;

public class DaoProvider {
    private static DaoProvider instance = new DaoProvider();

    private DaoProvider() {}
    public static DaoProvider getInstance(){
        return instance;
    }
    private final UserDao userDao=new UserDaoImpl();
    public UserDao getUserDao(){
        return userDao;
    }


}

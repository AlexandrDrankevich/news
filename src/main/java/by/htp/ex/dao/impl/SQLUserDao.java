package by.htp.ex.dao.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.UserDao;

import java.sql.SQLException;
import java.util.Random;

public class SQLUserDao implements UserDao {
    @Override
    public boolean authorization(String login, String password) throws DaoException {
        Random rand = new Random();
        int value = rand.nextInt(1000);

      //  if(value % 3 == 0) {
        //   try {
        //        throw new SQLException("stub exception");
        //    }catch(SQLException e) {
        //        throw new DaoException(e);
      //      }
      //  }else if (value % 2 == 0) {
        //    return true;
      //  }else {
        if (value % 2 == 0) {
              return true;}
           return false;
       // }
    }

    @Override
    public boolean registration(NewUserInfo user) throws DaoException {
        Random rand = new Random();
        int value = rand.nextInt(1000);

        //  if(value % 3 == 0) {
        //   try {
        //        throw new SQLException("stub exception");
        //    }catch(SQLException e) {
        //        throw new DaoException(e);
        //      }
        //  }else if (value % 2 == 0) {
        //    return true;
        //  }else {
        if (value % 2 == 0) {
            return true;}
        return false;
        // }
    }
}

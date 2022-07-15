package by.htp.ex.dao.impl;

import by.htp.ex.dao.DaoException;
import by.htp.ex.dao.NewsDao;

import java.sql.SQLException;
import java.util.Random;

public class SQLNewsDao implements NewsDao {
    Random rand = new Random();
    int value = rand.nextInt(1000);


    @Override
    public boolean add(String text) throws DaoException {
        try {
            if (value % 3 == 0) {
                throw new SQLException("stub exception");
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return false;
    }

    @Override
    public boolean edit(String text) throws DaoException {
        try {
            if (value % 3 == 0) {
                throw new SQLException("stub exception");
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return false;
    }

    @Override
    public boolean delete(String text) throws DaoException {
        try {
            if (value % 3 == 0) {
                throw new SQLException("stub exception");
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return false;
    }
}

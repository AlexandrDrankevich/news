package by.htp.ex.dao;

import by.htp.ex.dao.DaoException;

public interface NewsDao {
    boolean add(String text) throws DaoException;
    boolean edit(String text) throws DaoException;
    boolean delete(String text) throws DaoException;
}

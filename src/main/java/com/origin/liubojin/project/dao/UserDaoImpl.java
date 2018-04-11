package com.origin.liubojin.project.dao;

import com.origin.liubojin.project.entity.UserEntity;
import com.origin.liubojin.project.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
public class UserDaoImpl implements UserDao {

    private Session session = HibernateUtil.getSession();

    @Override
    public void save(UserEntity user) {
        Transaction ts = session.beginTransaction();
        try {
            session.save(user);
            ts.commit();
        } finally {
            if (session != null) {
                session.close();
            }

        }
    }

    @Override
    public UserEntity findUserById(int id) {
        try {
            return (UserEntity) session.get(UserEntity.class, id);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
package com.origin.liubojin.project.dao;

import com.origin.liubojin.project.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author liubojin
 * Created on 2018/4/11
 */
@Repository
public interface UserDao {
    void save(UserEntity user);

    UserEntity findUserById(int id);
}

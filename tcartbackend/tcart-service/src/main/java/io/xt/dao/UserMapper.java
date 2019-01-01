package io.xt.dao;

import io.xt.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    User selectByUsername(String username);
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
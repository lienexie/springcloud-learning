package com.xzp.springcloud.service;

import com.xzp.springcloud.pojo.User;

import java.util.List;

/**
 * @author Xiezhipeng
 * @Description
 * @Date 2020/5/19
 */
public interface UserService {

    void insert(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> listUsersByIds(List<Long> ids);
}

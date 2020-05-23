package com.xzp.springcloud.service.impl;

import com.xzp.springcloud.pojo.Result;
import com.xzp.springcloud.pojo.User;
import com.xzp.springcloud.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Xiezhipeng
 * @Description
 * @Date 2020/5/22
 */
@Component
public class UserFallbackService implements UserService {

    @Override
    public Result insert(User user) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<User> getUser(Long id) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<List<User>> listUsersByIds(List<Long> ids) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<User> getByUsername(String username) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result update(User user) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result delete(Long id) {
        return new Result("调用失败，服务被降级",500);
    }

}

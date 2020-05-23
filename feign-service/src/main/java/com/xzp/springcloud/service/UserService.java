package com.xzp.springcloud.service;

import com.xzp.springcloud.pojo.Result;
import com.xzp.springcloud.pojo.User;
import com.xzp.springcloud.service.impl.UserFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Xiezhipeng
 * @Description
 * @Date 2020/5/22
 */
@FeignClient(value = "user-service", fallback = UserFallbackService.class)
public interface UserService {

    @PostMapping("/user/insert")
    Result insert(@RequestBody User user);

    @GetMapping("/user/{id}")
    Result<User> getUser(@PathVariable Long id);

    @GetMapping("/user/listUsersByIds")
    Result<List<User>> listUsersByIds(@RequestParam List<Long> ids);

    @GetMapping("/user/getByUsername")
    Result<User> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    Result update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    Result delete(@PathVariable Long id);

}

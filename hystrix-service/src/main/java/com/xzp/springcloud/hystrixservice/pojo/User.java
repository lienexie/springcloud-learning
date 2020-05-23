package com.xzp.springcloud.hystrixservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xiezhipeng
 * @Description 用户实体类
 * @Date 2020/5/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;

}

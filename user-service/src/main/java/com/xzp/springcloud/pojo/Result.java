package com.xzp.springcloud.pojo;

import lombok.Data;

/**
 * @author Xiezhipeng
 * @Description 返回结果类
 * @Date 2020/5/19
 */
@Data
public class Result<T> {

    private T data;

    private String message;

    private int code;

    public Result() {
    }

    public Result(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public Result(String message, Integer code) {
        this(null, message, code);
    }

    public Result(T data) {
        this(data, "操作成功", 200);
    }

}

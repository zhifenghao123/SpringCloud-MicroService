package com.howdev.springcloud.entity;

import lombok.Data;

/**
 * 通用的返回对象
 *
 * @author haozhifeng
 * @date 2023/04/06
 */
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}

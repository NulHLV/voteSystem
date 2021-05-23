package com.nullv.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

/**
 * 返回前端数据包装类
 *
 * @creat: 2019-08-27 上午 10:04 刘同学
 * @param: null
 * @return:
 */

public class RES {
    // 表示状态码  200 请求成功    404 路径错误  500 后端错误
    // 或者其他自定义的状态码
    private int code;
    // 返回响应信息
    private String message;
    // 返回数据
    private Object data;
}

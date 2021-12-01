package com.github.youshujava.bean.response;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 13:48
 */
@Data
public class YoushuResponse<T> {
    private Integer retcode;
    private String errmsg;
    private T data;
}

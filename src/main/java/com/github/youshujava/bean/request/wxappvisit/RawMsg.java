package com.github.youshujava.bean.request.wxappvisit;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/1 10:08
 */
@Data
public class RawMsg {
    private String ref_date;
    private List<PageData> list;
}

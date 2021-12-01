package com.github.youshu.bean.request.wxappvisit;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/1 10:16
 */
@Data
public class PageData {
    private String page_path;
    private Long page_visit_pv;
    private Integer page_visit_uv;
    private Float page_staytime_pv;
    private Long entrypage_pv;
    private Integer exitpage_pv;
    private Integer page_share_pv;
    private Integer page_share_uv;
}

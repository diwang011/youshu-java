/**
 * Copyright 2021 bejson.com
 */
package com.github.youshu.bean.request.sku;

import lombok.Data;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class Video {
    /**
     *视频地址；字段长度最小 1 字节，长度最大 2048 字节
     */
    private String img_url;
    /**
     *视频封面图片地址，1张，字段长度最小 1 字节，长度最大 2048 字节
     */
    private String video_url;

}
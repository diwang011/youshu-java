/**
 * Copyright 2021 bejson.com
 */
package com.github.youshujava.bean.request.sku;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/11/30 10:53
 */
@Data
public class MediaInfo {
    /**
     *主图图片信息列表 数组最大长度 10
     * 必填
     */
    private Img primary_imgs;
    /**
     *商品轮播图信息列表 数组最大长度 10
     * 必填
     */
    private List<Img> imgs;
    /**
     *商品属性图信息列表 数组最大长度 10
     */
    private List<Img> prop_imgs;
    /**
     *详情页图片信息列表 数组最大长度 50
     */
    private List<Img> detail_imgs;
    /**
     *商品图片及视频信息 数组最大长度 10
     */
    private List<Video> videos;

}
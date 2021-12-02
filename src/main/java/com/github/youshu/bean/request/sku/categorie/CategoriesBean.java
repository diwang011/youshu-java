package com.github.youshu.bean.request.sku.categorie;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/2 15:51
 */
@Data
public class CategoriesBean extends YoushuRequest {
    /**
     * 商品类目列表，数组最大长度 50
     * 必填
     */
    private List<Categorie> categories;
}

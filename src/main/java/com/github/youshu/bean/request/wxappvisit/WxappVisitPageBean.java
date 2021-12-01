package com.github.youshu.bean.request.wxappvisit;

import com.github.youshu.bean.request.YoushuRequest;
import lombok.Data;
import java.util.List;

/**
 * @Description:
 * @Author: fun
 * @Date: 2021/12/1 10:06
 */
@Data
public class WxappVisitPageBean extends YoushuRequest {
    /**
     * 微信小程序后台请求结果列表
     * 必填
     */
    private List<RawMsg> rawMsg;
}

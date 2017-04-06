package com.nextyu.pay.ali.app;

import com.nextyu.pay.ali.dto.AliAppPayDTO;
import com.nextyu.pay.ali.util.OrderInfoUtil;

import java.util.Map;

/**
 * created on 2017-04-06 10:44
 *
 * @author nextyu
 */
public class AliAppPay {
    private AliAppPay() {
    }

    /**
     * 支付宝app,构建支付信息
     *
     * @param aliAppPayDTO
     * @return
     */
    public static String buildPayInfo(AliAppPayDTO aliAppPayDTO) {
        Map<String, String> params = OrderInfoUtil.buildOrderParamMap(aliAppPayDTO);
        String orderParam = OrderInfoUtil.buildOrderParam(params);
        String sign = OrderInfoUtil.getSign(params, aliAppPayDTO.getAppPrivateKey());
        return orderParam + "&" + sign;
    }


}

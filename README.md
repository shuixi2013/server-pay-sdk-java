## 支付宝和微信支付服务端sdk

- 因为支付宝和微信支付的集成,都需要加密编码等一系列繁琐的操作,这些操作都应该在服务端完成,处理之后的支付数据再返回给客户端.
- 客户端拿到这些支付信息,就可以调用厂商提供的客户端sdk里面的方法来完成支付.
- 所以封装了服务端生成支付信息的方法.


## 支付分类

1. 支付宝
    1. 电脑网站支付(扫码支付) AliPCPay.java
    2. 手机网站支付 AliWapPay.java
    3. App支付 AliAppPay.java

2. 微信
    1. 电脑网站支付(扫码支付) WxPCPay.java
    2. 公众号支付 WxPublicPay.java
    3. App支付 WxAppPay.java

## 使用方法
1. 支付宝
    1. 电脑网站支付(扫码支付) 
    ```
    AliPCPay.buildRequestHtml(AliPCPayDTO aliPCPayDTO);
    ```
    2. 手机网站支付
    ```
    AliWapPay.buildRequestHtml(AliWapPayDTO aliWapPayDTO);
    ```
    3. App支付
    ```
    AliAppPay.buildPayInfo(AliAppPayDTO aliAppPayDTO);
    ```
    
2. 微信
    1. 电脑网站支付(扫码支付)
    ```
    WxPCPay.getUrlCode(WxPCPayDTO wxPCPayDTO);
    ```
    2. 公众号支付
    ```
    WxPublicPay.getOpenId(String appId, String secret, String code);
    WxPublicPay.buildPayInfo(WxPublicPayDTO wxPublicPayDTO);
    ```
    3. App支付
    ```
    WxAppPay.buildPayInfo(WxAppPayDTO wxAppPayDTO);
    ```
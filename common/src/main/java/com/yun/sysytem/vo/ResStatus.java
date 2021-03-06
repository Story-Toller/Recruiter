package com.yun.sysytem.vo;

public class ResStatus {
    public static final int OK = 10000;
    public static final int NO = 10001;
    //    用户未登录
    public static final int NOT_LOGIN = 10002;
    //    用户登录过期
    public static final int LOGIN_TIMEOUT = 10003;
    //用户token不合法
    public static final int LOGIN_WRONGFUL = 10004;
    //未处理事件
    public static final int UNTREATED = 10005;
    //同意事件
    public static final int AGREE = 10006;
    //反对事件
    public static final int AGAINST = 10007;
    //未添加公司
    public static final int NOCOMPANY = 10008;
    //必填项空缺
    public static final int REQUIRED_VACANCY = 10009;
    //公司信息已存在
    public static final int HASCOMPANYINF = 10010;
}



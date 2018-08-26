package com.xianghe.networkdemo.app;

public class NetworkConstants {

    /**
     * 万能签名（测试使用）
     */
    public static final String signValue = "TY-8da23798c69b7bf706604f25c2c9549ae21593b6bdf4be64";
//    public static final String signValue = "";

    /**
     * URL地址
     */
    public static final String BASE_URL = "http://test.i-weiying.com/api/";//测试地址
//    public static final String BASE_URL = "http://pre.i-weiying.com/api/";//预发布地址
//    public static final String BASE_URL = "http://ivy.i-weiying.com/api/";//正式地址


    /**
     * 用户登录信息 sp文件名称
     */
    public static final String SP_USERINFO = "USER_INFO";

    /**
     * 用户登录信息
     */
    public static class UserInfo {
        /**
         * 用户id
         */
        public static final String UID = "Uid";
        /**
         * 是否登录
         */
        public static final String IS_LOGIN = "mIsLogin";
    }

    /**
     * 用户token
     */
    public static final String TICKET = "ticket";

    /**
     * ticket过期时间 单位:秒（15天）
     */
    public static final int TIMEOUT_TICKET = 15 * 24 * 60 * 60;


    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    /**
     * 系统设置参数sp xml文件名
     */
    public static final String SP_SYSTEM_SETTING = "IVY_SETTINGS";

    public static final String KEY_GRPS_PLAY = "KEY_GPRS_PLAY";
    /**
     * 手机号码长度
     */
    public static final int PHONE_NUMBER_LENGTH = 11;
    /**
     * 打开本地视频文件夹请求code
     */
    public static final int REQUEST_CODE_VIDEO_CHOOSE = 15659;
    /**
     * 相机权限
     */
    public static final int PERMISSION_REQUEST_CODE_CAMERA = 15658;
    /**
     * 联系人权限
     */
    public static final int PERMISSION_REQUEST_CODE_CONTACT = 15659;
    /**
     * 视频路径key
     */
    public static final String KEY_VIDEO_PATH = "Key_VideoPath";

}

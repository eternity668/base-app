package yongbo.tan.baseapp.config;

/**
 * Application constants.
 */
public final class Constants {

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";
    
    public static final String PHONE_REGEX="^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$";

    private Constants() {
    }
}

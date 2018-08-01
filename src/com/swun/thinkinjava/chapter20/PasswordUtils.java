package com.swun.thinkinjava.chapter20;

/**
 * Created by Maven on 2018/8/1.
 * Description:
 */
public class PasswordUtils {
    @UserCase(id = 12, description = "hello")
    public boolean validePwd(String pwd) {
        return pwd.matches("\\w*\\d\\w*");
    }

    @UserCase(id = 99, description = "reverse the password")
    public String encryPwd(String pwd) {
        return new StringBuilder(pwd).reverse().toString();
    }


}
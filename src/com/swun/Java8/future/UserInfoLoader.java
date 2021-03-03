package com.swun.Java8.future;

/**
 * <p>
 *
 * </p>
 *
 * @author mf
 * @date 2021-03-03 11:42
 */
public class UserInfoLoader implements DataLoader{
    @Override
    public String load() {
        delay();
        return "userInfo";
    }
}

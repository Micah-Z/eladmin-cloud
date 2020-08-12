package org.micah.system.service;

/**
 * @program: eladmin-cloud
 * @description:
 * @author: Micah
 * @create: 2020-08-10 21:27
 **/
public interface IVerifyService {
    /**
     * 验证验证码是否正确
     * @param s
     * @param code
     */
    void validated(String s, String code);
}

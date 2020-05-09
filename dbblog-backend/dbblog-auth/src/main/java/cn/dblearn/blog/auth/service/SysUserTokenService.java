package cn.dblearn.blog.auth.service;

import cn.dblearn.blog.common.Result;
import cn.dblearn.blog.entity.sys.SysUserToken;

/**
 * SysUserTokenService
 *
 * @author kb1s1024
 * @date 2018/10/20 15:17
 * @email kb1s1024@126.com
 * @description
 */
public interface SysUserTokenService {
    /**
     * 生成Token
     * @param userId
     * @return
     */
    Result createToken(Integer userId);

    /**
     * 查询token
     * @param token
     * @return
     */
    SysUserToken queryByToken(String token);

    /**
     * 退出登录
     * @param userId
     */
    void logout(Integer userId);

    /**
     * 续期
     * @param userId
     * @param token
     */
    void refreshToken(Integer userId, String token);
}

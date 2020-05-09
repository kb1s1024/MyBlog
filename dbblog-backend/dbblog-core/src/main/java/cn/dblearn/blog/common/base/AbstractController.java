package cn.dblearn.blog.common.base;

import cn.dblearn.blog.entity.sys.SysUser;
import org.apache.shiro.SecurityUtils;

/**
 * AbstractController
 *
 * @author kb1s1024
 * @date 2018/10/22 12:35
 * @email kb1s1024@126.com
 * @description
 */
public class AbstractController {

    protected SysUser getUser(){
        return (SysUser) SecurityUtils.getSubject().getPrincipal();
    }

    protected Integer getUserId(){
        return getUser().getUserId();
    }
}

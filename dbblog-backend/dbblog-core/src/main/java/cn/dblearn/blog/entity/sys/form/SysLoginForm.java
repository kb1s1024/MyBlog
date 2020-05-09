package cn.dblearn.blog.entity.sys.form;

import lombok.Data;

/**
 * SysLoginForm
 *
 * @author kb1s1024
 * @date 2018/10/20 14:51
 * @email kb1s1024@126.com
 * @description 登录表单对象
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;
}

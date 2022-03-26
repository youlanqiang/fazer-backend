package top.youlanqiang.fazer.module.auth.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import top.youlanqiang.fazer.commons.base.BaseService;
import top.youlanqiang.fazer.module.auth.domain.BaseUser;

/**
 * @author youlanqiang
 * created in 2021/10/27 10:59 下午
 */
public interface IBaseUserService extends UserDetailsService, BaseService<BaseUser> {
}

package com.xiaoi.document.split.security.config;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * 资源管理权限获取
 *
 * @Author Yuan Jingshan
 * @Date 2018-05-29
 */
@Service
public class AuthorizationAccessDecisionManager implements AccessDecisionManager {

    /**
     * @param authentication   当前认证通过的用户的认证信息
     * @param object           当前用户访问的受保护资源,如URL
     * @param configAttributes 当前受保护资源需要的角色,权限
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            // 角色名
            String roleName = authority.getAuthority();

            for (ConfigAttribute configAttribute : configAttributes) {
                if (configAttribute != null && !StringUtils.isEmpty(roleName)) {
                    if (configAttribute.getAttribute().equals(roleName)) {
                        return;
                    }
                }
            }
        }
        throw new AccessDeniedException("AbstractAccessDecisionManager.accessDenied, Access is denied");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

}

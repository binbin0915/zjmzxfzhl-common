package com.zjmzxfzhl.common.remote.feign.fallback;

import com.zjmzxfzhl.common.core.Result;
import com.zjmzxfzhl.common.core.base.UserInfo;
import com.zjmzxfzhl.common.remote.feign.RemoteAppUserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 庄金明
 * @date
 */
@Slf4j
@Component
public class RemoteAppUserServiceFallbackImpl implements RemoteAppUserService {
    @Setter
    private Throwable cause;

    /**
     * 通过用户名查询用户信息
     *
     * @param userId 用户名
     * @return Result
     */
    @Override
    public Result<UserInfo> info(String userId, String inner) {
        log.error("feign 查询用户信息失败:{}", userId, cause);
        return null;
    }
}

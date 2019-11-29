package com.gsjk.user;

import com.gsjk.result.Result;

/**
 * @program: usermanagement
 * @Description: declare user interface
 * @author: lzy
 * @date: 2019/11/25
 */
public interface UserService {
    /**
     * @Description: to login the system
     * @Param: [userinfo]
     * @return: com.gsjk.result.Result
     * @author: lzy
     * @date: 2019/11/25
     */
    public Result login(UserInfo userinfo);

    /**
     * @Description: to register the new user
     * @Param: [userInfo]
     * @return: com.gsjk.result.Result
     * @author: lzy
     * @date: 2019/11/25
     */
    public Result register(UserInfo userInfo);
}

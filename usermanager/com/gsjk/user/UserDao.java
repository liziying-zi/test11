package com.gsjk.user;

/**
 * @program: usermanagement
 * @Description: to get user information from data source
 * @author: lzy
 * @date: 2019/11/25
 */
public interface UserDao {
    /**
     * @Description: to find user by user name
     * @Param: [username]
     * @return: com.gsjk.user.UserInfo
     * @author: lzy
     * @date: 2019/11/25
     */
    public UserInfo findUserInfoByName(String username);
    public boolean saveUser(UserInfo userInfo);
}

package cn.plasticlove.service;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dto.UserDto;
import cn.plasticlove.entity.User;

/**
 * 用户相关接口
 */
public interface UserService {
    /**
     * Gets user by user id.
     *
     * @param id the id
     * @return user by user id
     */
    public User getUserByUserId(Long id);

    /**
     * Login
     *
     * @param username the username
     * @param password the password
     * @return the server response
     */
    public ServerResponse login(String username, String password);

    /**
     * Register
     *
     * @param userDto the user dto
     * @return server response
     */
    public ServerResponse register(UserDto userDto);
}

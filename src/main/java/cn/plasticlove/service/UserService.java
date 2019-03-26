package cn.plasticlove.service;

import cn.plasticlove.dto.UserDto;
import cn.plasticlove.entity.User;

/**
 * 用户相关接口
 */
public interface UserService {
    /**
     * 根据用户id封装用户
     * @param id
     * @return
     */
    public User getUserByUserId(Long id);
    /**
     * 根据用户id封装用户dto
     * @param id
     * @return
     */
    public UserDto getUserDtoById(Long id);
}

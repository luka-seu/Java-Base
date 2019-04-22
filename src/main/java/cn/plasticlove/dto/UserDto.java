package cn.plasticlove.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * The type User dto.
 *
 * @author luka -seu
 * @description 用户的dto
 * @create 2019 /3/26-20:08
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String mobile;

    private String username;

    private String password;

    private String email;

    private String github;

    private String sinaBlog;

    private String location;

    private String remark;

    private String gender;

    private String avatar;


}

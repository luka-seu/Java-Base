package cn.plasticlove.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author luka-seu
 * @description 用户的dto
 * @create 2019/3/26-20:08
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    private String username;

    // private String password;

    private String nickname;

    // private String mobile;

    private String email;

    private String qq;

    // private Date birthday;

    // private Byte gender;

    // private String avatar;

    // private String userType;

    // private String company;

    private String blog;

    private String location;

    // private String source;

    // private Byte privacy;

    // private Byte notification;

    // private Integer score;
    //
    // private Integer experience;
    //
    // private String regIp;
    //
    // private String lastLoginIp;
    //
    // private Date lastLoginTime;
    //
    // private Integer loginCount;
    //
    private String remark;
    //
    // private Integer status;
    //
    // private Date createTime;
    //
    // private Date updateTime;

}

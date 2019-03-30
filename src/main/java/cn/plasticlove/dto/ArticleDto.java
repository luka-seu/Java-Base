package cn.plasticlove.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author luka-seu
 * @description 文章的dto
 * @create 2019/3/22-20:28
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
    private Long id;//文章id

    private String title;//文章标题

    private String username;//文章作者

    private String coverImage;//文章封面

    private String typename;//文章类型

    private String description;//文章简介

    private int commentCount;//评论总数

    private Boolean original;//是否原创

    private Boolean comment;//是否开启评论

    private Date createTime;//创建时间
    private Date updateTime;//更新时间

    private String content;//文章内容


}

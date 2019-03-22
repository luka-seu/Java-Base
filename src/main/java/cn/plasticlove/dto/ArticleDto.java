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

    private Long userId;//文章作者

    private String coverImage;//文章封面

    private Long typeId;//文章类型id

    private String description;//文章简介

    private Boolean comment;//是否可以评论

    private Date createTime;//创建时间
}

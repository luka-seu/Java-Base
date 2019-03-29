package cn.plasticlove.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author luka-seu
 * @description 前端文章上传表单参数绑定
 * @create 2019-03 30-00:03
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticlePageDto {
    private String title;//文章标题

    private String username;//文章作者

    private String coverImage;//文章封面

    private String typename;//文章类型

    private String description;//文章简介



    private Boolean original;//是否原创

    private Boolean comment;//是否开启评论

    private String content;//文章内容

}

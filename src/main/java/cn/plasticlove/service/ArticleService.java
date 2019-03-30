package cn.plasticlove.service;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.dto.ArticlePageDto;
import com.github.pagehelper.PageInfo;

/**
 * The interface Article service.
 *
 * @author luka -seu
 * @description 文章业务层接口
 * @create 2019 /3/22-19:51
 */
public interface ArticleService {


    /**
     * Gets article list.
     *
     * @param pageNum  the page num
     * @param pageSize the page size
     * @return the article list
     */
    public ServerResponse<PageInfo<ArticleDto>> getArticleList(int pageNum, int pageSize);


    /**
     * Insert article server response.
     *
     * @param articlePageDto the article page dto
     * @return the server response
     */
    public ServerResponse insertArticle(ArticlePageDto articlePageDto);

    /**
     * Get article by id server response.
     *
     * @param articleId the article id
     * @return the server response
     */
    public ServerResponse getArticleById(String articleId);
}

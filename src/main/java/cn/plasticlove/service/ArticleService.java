package cn.plasticlove.service;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dto.ArticleDto;
import com.github.pagehelper.PageInfo;

/**
 * @author luka-seu
 * @description 文章业务层接口
 * @create 2019/3/22-19:51
 */
public interface ArticleService {

    /**
     * @description: 分页查询文章列表
     * @param:
     * @return:
     * @author: luka-seu
     * @date: 2019/3/22 20:27
     */
    public ServerResponse<PageInfo<ArticleDto>> getArticleList(int pageNum, int pageSize);
}

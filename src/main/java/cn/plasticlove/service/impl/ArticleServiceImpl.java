package cn.plasticlove.service.impl;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dao.ArticleMapper;
import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.entity.Article;
import cn.plasticlove.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luka-seu
 * @description 文章业务层实现
 * @create 2019/3/22-19:51
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * @description: 分页查询文章列表
     * @param:
     * @return:
     * @author: luka-seu
     * @date: 2019/3/22 20:27
     */
    @Override
    public ServerResponse getArticleList(int pageNum, int pageSize) {
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        List<ArticleDto> articleList = articleMapper.selectArticleList();
        PageInfo<ArticleDto> info = new PageInfo<>(articleList);


        return ServerResponse.createResponseBySuccessMsgAndData("查询成功",info);
    }
}

package cn.plasticlove.dao;

import cn.plasticlove.dto.ArticleDto;
import cn.plasticlove.entity.Article;

import java.util.List;

/**
 * The interface Article mapper.
 */
public interface ArticleMapper {
    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    int deleteByPrimaryKey(Long id);

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(Article record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Article record);

    /**
     * Select by primary key article.
     *
     * @param id the id
     * @return the article
     */
    Article selectByPrimaryKey(Long id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * Update by primary key with blo bs int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Article record);

    /**
     * Select article list list.
     *
     * @return the list
     */
    List<ArticleDto> selectArticleList();
}
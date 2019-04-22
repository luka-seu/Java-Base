package cn.plasticlove.dao;

import cn.plasticlove.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Comment mapper.
 */
public interface CommentMapper {
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
    int insert(Comment record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Comment record);

    /**
     * Select by primary key comment.
     *
     * @param id the id
     * @return the comment
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Comment record);

    /**
     * 查询文章的总评论数
     *
     * @param articleId the article id
     * @return int
     */
    int selectConutCommentByArticleId(@Param("articleId") Long articleId);
}
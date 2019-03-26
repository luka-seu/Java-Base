package cn.plasticlove.dao;

import cn.plasticlove.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    /**
     * 查询文章的总评论数
     * @param articleId
     * @return
     */
    int selectConutCommentByArticleId(@Param("articleId") Long articleId);
}
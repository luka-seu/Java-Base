package cn.plasticlove.dao;

import cn.plasticlove.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    Type selectByTypename(@Param("typename") String typename);

    List<Type> selectTypeList();


}
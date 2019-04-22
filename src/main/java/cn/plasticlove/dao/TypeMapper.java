package cn.plasticlove.dao;

import cn.plasticlove.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Type mapper.
 */
public interface TypeMapper {
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
    int insert(Type record);

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(Type record);

    /**
     * Select by primary key type.
     *
     * @param id the id
     * @return the type
     */
    Type selectByPrimaryKey(Long id);

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(Type record);

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(Type record);

    /**
     * Select by typename type.
     *
     * @param typename the typename
     * @return the type
     */
    Type selectByTypename(@Param("typename") String typename);

    /**
     * Select type list list.
     *
     * @return the list
     */
    List<Type> selectTypeList();


}
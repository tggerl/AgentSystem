package com.jbit.dao;

import com.jbit.entity.AsCustoms;

public interface AsCustomsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    int insert(AsCustoms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    int insertSelective(AsCustoms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    AsCustoms selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsCustoms record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_customs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsCustoms record);
}
package com.jbit.dao;

import com.jbit.entity.AsSystemconfig;

public interface AsSystemconfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    int insert(AsSystemconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    int insertSelective(AsSystemconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    AsSystemconfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsSystemconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsSystemconfig record);
}
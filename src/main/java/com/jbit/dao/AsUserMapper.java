package com.jbit.dao;

import com.jbit.entity.AsUser;

public interface AsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    int insert(AsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    int insertSelective(AsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    AsUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsUser record);
}
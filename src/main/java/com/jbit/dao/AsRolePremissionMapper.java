package com.jbit.dao;

import com.jbit.entity.AsRolePremission;

public interface AsRolePremissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    int insert(AsRolePremission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    int insertSelective(AsRolePremission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    AsRolePremission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsRolePremission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_role_premission
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsRolePremission record);
}
package com.jbit.dao;

import com.jbit.entity.AsAccountdetail;

public interface AsAccountdetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int insert(AsAccountdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int insertSelective(AsAccountdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    AsAccountdetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsAccountdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AsAccountdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_accountdetail
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsAccountdetail record);
}
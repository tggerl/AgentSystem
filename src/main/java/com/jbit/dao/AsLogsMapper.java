package com.jbit.dao;

import com.jbit.entity.AsLogs;
import com.jbit.entity.AsLogsWithBLOBs;

public interface AsLogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int insert(AsLogsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int insertSelective(AsLogsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    AsLogsWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AsLogsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(AsLogsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table as_logs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AsLogs record);
}
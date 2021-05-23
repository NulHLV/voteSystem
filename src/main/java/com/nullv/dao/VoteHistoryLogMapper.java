package com.nullv.dao;

import com.nullv.pojo.VoteHistoryLog;

public interface VoteHistoryLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VoteHistoryLog record);

    int insertSelective(VoteHistoryLog record);

    VoteHistoryLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VoteHistoryLog record);

    int updateByPrimaryKey(VoteHistoryLog record);
}
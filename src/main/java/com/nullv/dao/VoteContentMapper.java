package com.nullv.dao;

import com.nullv.pojo.VoteContent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VoteContentMapper {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(VoteContent record);
//
//    int insertSelective(VoteContent record);
//
//    VoteContent selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(VoteContent record);
//
//    int updateByPrimaryKey(VoteContent record);

    List<VoteContent> getVoteContentByVoteID(Integer voteID);

    Integer voting(Integer voteContentID);

}
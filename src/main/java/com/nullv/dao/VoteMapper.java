package com.nullv.dao;

import com.nullv.pojo.Vote;
import com.nullv.pojo.vo.VoteVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface VoteMapper {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Vote record);
//
//    int insertSelective(Vote record);
//
//    Vote selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Vote record);
//
//    int updateByPrimaryKey(Vote record);

    List<Vote> getAllVote();

    List<Vote> getAllVoteByName(String voteTitle);

    List<Vote> getAllVoteByType(String voteType);


}
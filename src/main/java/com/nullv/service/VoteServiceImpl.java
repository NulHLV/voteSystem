package com.nullv.service;

import com.nullv.dao.VoteMapper;
import com.nullv.pojo.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteMapper {

    @Autowired
    VoteMapper voteMapper;

    @Override
    public List<Vote> getAllVote() {
        return voteMapper.getAllVote();
    }

    @Override
    public List<Vote> getAllVoteByName(String voteTitle) {
        return voteMapper.getAllVoteByName(voteTitle);
    }

    @Override
    public List<Vote> getAllVoteByType(String voteType) {
        return voteMapper.getAllVoteByType(voteType);
    }

}
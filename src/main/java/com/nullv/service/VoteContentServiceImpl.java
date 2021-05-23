package com.nullv.service;

import com.nullv.dao.VoteContentMapper;
import com.nullv.pojo.VoteContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteContentServiceImpl implements VoteContentMapper {

    @Autowired
    private VoteContentMapper voteContentMapper;

    @Override
    public List<VoteContent> getVoteContentByVoteID(Integer voteID) {
        return voteContentMapper.getVoteContentByVoteID(voteID);
    }

    @Override
    public Integer voting(Integer voteContentID) {
        return voteContentMapper.voting(voteContentID);
    }
}
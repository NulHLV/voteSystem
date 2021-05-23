package com.nullv.pojo;

import java.util.Date;

public class VoteHistoryLog {
    private Integer id;

    private Integer userId;

    private Integer voteId;

    private Date createTime;

    public VoteHistoryLog(Integer id, Integer userId, Integer voteId, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.voteId = voteId;
        this.createTime = createTime;
    }

    public VoteHistoryLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
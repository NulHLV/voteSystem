package com.nullv.pojo;

import java.util.Date;

public class VoteLog {
    private Integer id;

    private Integer voteId;

    private String username;

    private Integer voteOptionId;

    private Date createTime;

    public VoteLog(Integer voteId, String username, Integer voteOptionId, Date createTime) {
        this.voteId = voteId;
        this.username = username;
        this.voteOptionId = voteOptionId;
        this.createTime = createTime;
    }

    public VoteLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getvoteOptionId() {
        return voteOptionId;
    }

    public void setvoteOptionId(Integer voteOptionId) {
        this.voteOptionId = voteOptionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
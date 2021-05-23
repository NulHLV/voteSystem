package com.nullv.pojo;

import java.util.Date;

public class Vote {
    private Integer id;

    private String votingTitle;

    private Integer votingType;

    private String votingDescription;

    private Integer votingState;

    private Date votingStartTime;

    private Date votingEndTime;

    private String votingUsername;

    private Integer votingMaxVote;

    private Date createTime;

    private Date modifiedTime;

    public Vote(Integer id, String votingTitle, Integer votingType, String votingDescription, Integer votingState, Date votingStartTime, Date votingEndTime, String votingUsername, Integer votingMaxVote, Date createTime, Date modifiedTime) {
        this.id = id;
        this.votingTitle = votingTitle;
        this.votingType = votingType;
        this.votingDescription = votingDescription;
        this.votingState = votingState;
        this.votingStartTime = votingStartTime;
        this.votingEndTime = votingEndTime;
        this.votingUsername = votingUsername;
        this.votingMaxVote = votingMaxVote;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    public Vote() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVotingTitle() {
        return votingTitle;
    }

    public void setVotingTitle(String votingTitle) {
        this.votingTitle = votingTitle == null ? null : votingTitle.trim();
    }

    public Integer getVotingType() {
        return votingType;
    }

    public void setVotingType(Integer votingType) {
        this.votingType = votingType;
    }

    public String getVotingDescription() {
        return votingDescription;
    }

    public void setVotingDescription(String votingDescription) {
        this.votingDescription = votingDescription == null ? null : votingDescription.trim();
    }

    public Integer getVotingContent() {
        return votingState;
    }

    public void setVotingContent(Integer votingContent) {
        this.votingState = votingContent;
    }

    public Date getVotingStartTime() {
        return votingStartTime;
    }

    public void setVotingStartTime(Date votingStartTime) {
        this.votingStartTime = votingStartTime;
    }

    public Date getVotingEndTime() {
        return votingEndTime;
    }

    public void setVotingEndTime(Date votingEndTime) {
        this.votingEndTime = votingEndTime;
    }

    public String getVotingUsername() {
        return votingUsername;
    }

    public void setVotingUsername(String votingUsername) {
        this.votingUsername = votingUsername == null ? null : votingUsername.trim();
    }

    public Integer getVotingMaxVote() {
        return votingMaxVote;
    }

    public void setVotingMaxVote(Integer votingMaxVote) {
        this.votingMaxVote = votingMaxVote;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
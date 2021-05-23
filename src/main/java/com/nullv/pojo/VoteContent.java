package com.nullv.pojo;

public class VoteContent {
    private Integer id;

    private Integer voteId;

    private String voteOptionContent;

    private String voteOptionDescription;

    private Integer voteCount;

    public VoteContent(Integer id, Integer voteId, String voteOptionContent, String voteOptionDescription, Integer voteCount) {
        this.id = id;
        this.voteId = voteId;
        this.voteOptionContent = voteOptionContent;
        this.voteOptionDescription = voteOptionDescription;
        this.voteCount = voteCount;
    }

    public VoteContent() {
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

    public String getVoteOptionContent() {
        return voteOptionContent;
    }

    public void setVoteOptionContent(String voteOptionContent) {
        this.voteOptionContent = voteOptionContent == null ? null : voteOptionContent.trim();
    }

    public String getVoteOptionDescription() {
        return voteOptionDescription;
    }

    public void setVoteOptionDescription(String voteOptionDescription) {
        this.voteOptionDescription = voteOptionDescription == null ? null : voteOptionDescription.trim();
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}
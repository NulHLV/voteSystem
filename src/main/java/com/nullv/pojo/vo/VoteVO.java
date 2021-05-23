package com.nullv.pojo.vo;

import com.nullv.pojo.Vote;
import com.nullv.pojo.VoteContent;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class VoteVO extends Vote {
    public List<VoteContent> voteContentList;

}
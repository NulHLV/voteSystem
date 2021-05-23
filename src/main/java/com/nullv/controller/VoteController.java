package com.nullv.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.nullv.pojo.Vote;
import com.nullv.pojo.VotePage;
import com.nullv.service.VoteContentServiceImpl;
import com.nullv.service.VoteServiceImpl;
import com.nullv.util.RES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vote")
public class VoteController {

    @Autowired
    VoteServiceImpl voteService;
    @Autowired
    VoteContentServiceImpl voteContentService;

    /**
     * 获取全部投票活动
     * <p>
     * 语法：@RequestParam(value=”参数名”,required=”true/false”,defaultValue=””)
     * value：参数名
     * required：是否包含该参数，默认为true，表示该请求路径中必须包含该参数，如果不包含就报错。
     * defaultValue：默认参数值，如果设置了该值，required=true将失效，自动为false,如果没有传该参数，就使用默认值
     *
     * @Author NulLV
     * @creat: 2021-05-19 22:51
     * @return: java.lang.String
     */
    @GetMapping("/getAllVote")
    public String getAllVote(@RequestParam(value = "pageNo") Integer pageNo,
                             @RequestParam(value = "pageSize") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Vote> voteList = voteService.getAllVote();
        VotePage<Vote> votePage = new VotePage<Vote>(voteList);
        return JSON.toJSONString(votePage);
    }

    /**
     * 根据名字模糊查询投票活动
     *
     * @Author NulLV
     * @creat: 2021-05-19 22:51
     * @return: java.lang.String
     */
    @GetMapping("/getAllVoteByName")
    public String getAllVoteByName(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                   @RequestParam(value = "pageSize", defaultValue = "9") Integer pageSize, @RequestParam String voteTitle) {
        PageHelper.startPage(pageNo, pageSize);
        List<Vote> voteList = voteService.getAllVoteByName(voteTitle);
        VotePage<Vote> votePage = new VotePage<Vote>(voteList);
        return JSON.toJSONString(votePage);
    }

    /**
     * 根据投票类型查询投票活动
     *
     * @Author NulLV
     * @creat: 2021-05-19 22:51
     * @return: java.lang.String
     */
    @GetMapping("/getAllVoteByType")
    public String getAllVoteByType(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                   @RequestParam(value = "pageSize", defaultValue = "9") Integer pageSize, @RequestParam String voteType) {
        PageHelper.startPage(pageNo, pageSize);
        List<Vote> voteList = voteService.getAllVoteByType(voteType);
        VotePage<Vote> votePage = new VotePage<Vote>(voteList);
        return JSON.toJSONString(votePage);
    }

    /**
     * 根据ID获得投票活动选项
     *
     * @Author NulLV
     * @creat: 2021-05-20 15:21
     * @return: java.lang.String
     */
    @GetMapping("/getVoteContentByVoteID")
    public String getVoteContentByVoteID(@RequestParam("voteID") Integer voteID) {
        return JSON.toJSONString(voteContentService.getVoteContentByVoteID(voteID));
    }

    /**
     * 投票
     *
     * @Author NulLV
     * @creat: 2021-05-22 18:18
     * @return:
     */
    @PostMapping("/voting")
    public String voting(@RequestBody String json) {
        RES res = new RES();
        JSONObject jsonObject = JSON.parseObject(json);
        Integer voteItemChecked = Integer.valueOf((String) jsonObject.get("voteItemChecked"));
        System.out.println();

        if (voteContentService.voting(voteItemChecked) != 0) {
            res.setCode(200);
            res.setMessage("投票成功");
        } else {
            res.setCode(500);
            res.setMessage("投票失败");
        }

        return JSON.toJSONString(res);
    }
}
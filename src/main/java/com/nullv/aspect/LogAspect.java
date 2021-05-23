package com.nullv.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nullv.dao.VoteLogMapper;
import com.nullv.pojo.VoteLog;
import com.nullv.util.DateTimeUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * AOP日志记录
 *
 * @author NulLV
 * @create 2021年05月23日 14:28
 */

@Component
@Aspect
public class LogAspect {

    @Autowired
    VoteLogMapper voteLogMapper;


    /**
     * 每次投票记录
     *
     * @Author NulLV
     * @creat: 2021-05-23 15:38
     * @return: void
     */
    @AfterReturning("execution(public * com.nullv.controller.VoteController.voting(..))")
    public void voteLog(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            JSONObject jsonObject = JSON.parseObject(String.valueOf(args[i]));

            Integer voteID = jsonObject.get("voteID") != null ? (Integer) jsonObject.get("voteID") : null;

            String voteOptionId1 = (String) jsonObject.get("voteItemChecked");
            Integer voteOptionId = voteOptionId1 != null && !voteOptionId1.equals("") ? Integer.parseInt(voteOptionId1) : null;

            String username = jsonObject.get("userName") != null && !jsonObject.get("userName").equals("") ? (String) jsonObject.get("userName") : null;

            VoteLog voteLog = new VoteLog(voteID, username, voteOptionId, DateTimeUtil.GetDate());
            voteLogMapper.insert(voteLog);
        }


    }
}
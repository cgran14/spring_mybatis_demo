package com.qf.service;

import com.qf.pojo.ReplyInfo;
import com.qf.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
    public List<ReplyVO> getReplyByComId(long comId);
    public boolean addReplyByReplyInfo(ReplyInfo replyInfo);
    public boolean deleteReplyByRepId(long repId);
}

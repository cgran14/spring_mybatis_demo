package com.qf.service;

import com.qf.pojo.CommentInfo;
import com.qf.vo.CommentVO;

import java.util.List;

public interface CommentService {
    public List<CommentVO> allComment();
    public boolean addComment(CommentInfo commentInfo);
    public boolean deleteCommentByComId(long comId);
}

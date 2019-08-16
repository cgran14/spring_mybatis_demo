package com.qf.dao;

import com.qf.pojo.CommentInfo;
import com.qf.vo.CommentVO;

import java.util.List;

public interface CommentMapper {
    public List<CommentVO> allComment();
    public Integer addComment(CommentInfo commentInfo);
    public Integer deleteCommentByComId(long comId);

}

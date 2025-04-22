package com.jige.jigemianshi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jige.jigemianshi.model.entity.Question;
import com.jige.jigemianshi.service.QuestionService;
import com.jige.jigemianshi.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2025-04-22 23:52:46
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}





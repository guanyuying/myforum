package com.community;

import com.community.dto.QuestionDTO;
import com.community.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CommunityApplicationTests {
    @Autowired
    private QuestionService questionService;

    @Test
    void contextLoads() {
        List<QuestionDTO> list = questionService.list();
        for (QuestionDTO questionDTO : list) {
            System.out.println(questionDTO.getUser().getAvatar_url());
        }
    }

}

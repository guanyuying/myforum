package com.community.dto;

import com.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private long gmt_create;
    private String description;
    private long gmt_modified;
    private Integer creator;
    private Integer view_count;
    private Integer like_count;
    private String tag;
    private Integer comment_count;
    private User user;
}

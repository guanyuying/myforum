package com.community.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Question {
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
}

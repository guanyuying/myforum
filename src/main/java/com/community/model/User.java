package com.community.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class User {
    private Integer id;
    private String name;
    private String account_id;
    private String token;
    private Long gmt_create;
    private Long gmt_modified;
    private String avatar_url;

}
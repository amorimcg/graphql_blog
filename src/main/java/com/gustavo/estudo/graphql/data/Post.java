package com.gustavo.estudo.graphql.data;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {

    private String id;
    private String content;

}

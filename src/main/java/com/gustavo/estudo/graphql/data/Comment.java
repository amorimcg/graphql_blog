package com.gustavo.estudo.graphql.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {

    private String id;

    private String content;

    private String postId;
}

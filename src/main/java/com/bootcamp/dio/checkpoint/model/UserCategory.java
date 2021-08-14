package com.bootcamp.dio.checkpoint.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class UserCategory {
    private Long id;
    private String description;
}

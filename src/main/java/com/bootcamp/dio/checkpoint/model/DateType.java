package com.bootcamp.dio.checkpoint.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class DateType {
    @Id
    private Long id;
    private String description;
}

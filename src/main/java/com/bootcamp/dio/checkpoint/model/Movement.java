package com.bootcamp.dio.checkpoint.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable{
        private Long movementId;
        private Long userId;
    }
    @EmbeddedId
    private MovementId id;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;
}

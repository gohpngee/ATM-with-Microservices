package com.gohpngee.account_service.account_model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class account_model {
    @Id
    @Column(unique = true, nullable = false)
    private long accountId;

    @Column(nullable = false)
    private String accountHolderName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private boolean status; //1 for active, 0 for inactive
}

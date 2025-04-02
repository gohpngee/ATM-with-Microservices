package com.gohpngee.account_service.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDTO {
    @NotNull
    private String accountHolderName;

    @Email
    private String email;

    @PositiveOrZero
    private BigDecimal iniialBalance;
}

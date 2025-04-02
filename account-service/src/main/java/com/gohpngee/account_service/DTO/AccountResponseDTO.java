package com.gohpngee.account_service.DTO;

import java.math.BigDecimal;

public class AccountResponseDTO {
    private long accountId;
    private String accountHolderName;
    private BigDecimal balance;
    private boolean status; //1 for active and 0 for inactive
}

package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message="Account Number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Account Number must be 10 digits")
    @Schema(
            description = "Account Number of Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type is required")
    @Schema(
            description = "Account type of Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch Address is required")
    @Schema(
            description = "Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;
}

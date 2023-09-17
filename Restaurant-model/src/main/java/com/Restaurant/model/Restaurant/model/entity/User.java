package com.Restaurant.model.Restaurant.model.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
 @NotNull
    private Integer userId;
 @NotEmpty
    private String userName;
    private String userAddress;
    @Size(min=10,max=10)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
    private String userNumber;

    private String useSpecialty;

    private Integer totalStaffs;
}

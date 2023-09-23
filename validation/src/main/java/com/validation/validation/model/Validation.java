package com.validation.validation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Validation {
    @Id
    private Integer userId;
    @NotBlank(message = "Username is required")
    private String userName;
    @NotBlank(message = "Date of Birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of Birth should be in yyyy-MM-dd format")
    private String  dateOfBirth;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String emailId;
    //@Size(min = 13, max = 13, message = "Phone number should be 12 digits long")
    @Pattern(regexp = "^\\+91[1-9][0-9]{9}$", message = "Invalid phone number format")
    private String phoneNumber;

    private LocalDate Date;

   private LocalTime Time;
   //use.setLocalDate(LocalDate.now())

}

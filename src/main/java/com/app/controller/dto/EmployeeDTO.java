package com.app.controller.dto;

import com.app.advice.validation.anotation.ValidName;
import com.app.advice.validation.anotation.ValidNumber;
import com.app.advice.validation.anotation.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @ValidName
    private String name;
    @ValidName
    private String lastName;
    @NotNull
    @Email
    @NotBlank(message = "El nombre es obligatorio y no puede estar vacío.")
    private String email;
    @ValidPassword
    private String password;

    @ValidNumber
    private String phone;
    private byte age;
    private double height;
    private boolean married;
    private LocalDate dateOfBirth;
    private DepartmentDTO departmentDTO;
}

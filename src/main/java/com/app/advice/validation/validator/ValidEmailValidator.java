package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidEmail;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidEmailValidator implements ConstraintValidator<ValidEmail, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        // Solo letras, números, puntos y guiones bajos antes del @
        // Dominio solo letras, números y puntos, con extensión mínima de 2 letras
        String emailRegex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,}$";

        return value.matches(emailRegex);
    }
}

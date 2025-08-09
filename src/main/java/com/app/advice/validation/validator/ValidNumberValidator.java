package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNumberValidator implements ConstraintValidator<ValidNumber, String> {

    @Override
    public void initialize(ValidNumber constraintAnnotation) {
        // No es necesario inicializar nada
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        // Solo permitir dígitos (cualquier longitud)
        return value.matches("\\d+");
    }
}

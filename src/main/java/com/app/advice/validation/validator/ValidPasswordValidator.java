package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPasswordValidator implements ConstraintValidator<ValidPassword, String> {
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(value.length()<8){
            return false;
        }
        if ((value.length() > 25)) {
            return false;
        }
        if (Character.isLowerCase(value.charAt(0))) {

            return false;
        }
        boolean hasSpecialChar=false;
        for (char ch : value.toCharArray()) {
            // If the character is NOT a letter and NOT a digit...
            if ( !Character.isLetterOrDigit(ch) ) {
                hasSpecialChar = true;
                break; // Found one, so we can stop the loop
            }
        }
        // After the loop, check the result
        if (!hasSpecialChar) {
            return false;
        }

        return true;
    }
}

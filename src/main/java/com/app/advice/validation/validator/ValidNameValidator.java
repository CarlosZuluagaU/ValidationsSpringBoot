package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        //REGLAS DE VALIDACION
        if(value== null){
            return false;
        }

        //Value cannot be empty
        if (value.isEmpty()){
            return false;
        }

        //Value cannot be greatet than 15
        if(value.length()>15){
            return false;
        }

        //Value cannot be less than 15
        if(value.length()<3){
            return false;
        }

        if(Character.isLowerCase(value.charAt(0))){
            return false;

        }

        return true;
    }
}

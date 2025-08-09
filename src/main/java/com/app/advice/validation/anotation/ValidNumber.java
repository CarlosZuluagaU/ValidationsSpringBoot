package com.app.advice.validation.anotation;

import com.app.advice.validation.validator.ValidNumberValidator;
import com.app.advice.validation.validator.ValidPasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = ValidNumberValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValidNumber {

    // A more general message

    // Or, a more specific message if the rule is, for example, value <= 10
    String message() default "El número no puede ser mayor que 10, y no puede contener caracteres especiales";


    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

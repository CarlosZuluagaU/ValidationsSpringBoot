package com.app.advice.validation.anotation;

import com.app.advice.validation.validator.ValidEmailValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidEmailValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValidEmail {

    String message() default "El email no tiene un formato válido";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

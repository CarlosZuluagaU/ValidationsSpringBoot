package com.app.advice.validation.anotation;


//Interfaz para validaciones

import com.app.advice.validation.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidNameValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValidName {
    String message() default "El nombre no puede tener caracteres especiales";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

package com.app.advice.validation.anotation;

import com.app.advice.validation.validator.ValidNameValidator;
import com.app.advice.validation.validator.ValidPasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = ValidPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValidPassword {

    String message() default "{custom.validation.message}";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

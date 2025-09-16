package com.leo.leasahub.web.form.annotation.validate;

import com.leo.leasahub.property.LimitsProperty;
import com.leo.leasahub.web.form.annotation.PasswordStrongAnnotation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author leo Yu
 * @date 2020/5/22 10:22
 */
public class PasswordStrongValidate implements ConstraintValidator<PasswordStrongAnnotation, String> {

    @Resource
    private LimitsProperty limitsProperty;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 数字和字母组合8-16位
        String regex = limitsProperty.getUserPasswordRegex();
        return value.matches(regex);
    }
}

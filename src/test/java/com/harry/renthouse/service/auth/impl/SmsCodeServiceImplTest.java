package com.leo.leasahub.service.auth.impl;

import com.leo.leasahub.leasahubApplicationTests;
import com.leo.leasahub.service.auth.SmsCodeService;
import com.leo.leasahub.validate.code.ValidateCodeTypeEnum;
import com.leo.leasahub.web.form.SendSmsForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author leo Yu
 * @date 2020/5/22 15:59
 */
class SmsCodeServiceImplTest extends leasahubApplicationTests {

    @Resource
    private SmsCodeServiceImpl smsCodeService;

    @Test
    void aliSendSms() {
        smsCodeService.aliSendSms("17879502601", "520");
    }

    @Test
    void sendSms(){
        SendSmsForm sendSmsForm = new SendSmsForm();
        sendSmsForm.setOperationType(ValidateCodeTypeEnum.LOGIN.getValue());
        sendSmsForm.setPhoneNumber("17879502601");
        smsCodeService.sendSms("17879502601", ValidateCodeTypeEnum.LOGIN.getValue());
    }
}
package com.shaype.sample.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import shaype.openapi.example.model.NotificationDto;

@Slf4j
@Component
public class AccountStatusChangeEventProcessor implements EventNotificationProcessor {

    @Override
    public void process(NotificationDto notification) {
        log.info("{} event processor invoke.", NotificationDto.TypeEnum.ACCOUNT_STATUS_CHANGE.getValue());
        //TODO: process your event here
    }
}

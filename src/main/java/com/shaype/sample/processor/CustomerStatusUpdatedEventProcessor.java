package com.shaype.sample.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import shaype.openapi.example.model.NotificationDto;

@Slf4j
@Component
public class CustomerStatusUpdatedEventProcessor implements EventNotificationProcessor {

    @Override
    public void process(NotificationDto notification) {
        log.info("{} event processor invoke.", NotificationDto.TypeEnum.CUSTOMER_STATUS_UPDATED.getValue());
        //TODO: process your event here
    }
}

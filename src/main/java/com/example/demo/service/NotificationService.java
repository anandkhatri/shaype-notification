package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import shaype.openapi.example.model.NotificationDto;

@Slf4j
@Component
public class NotificationService {

    public void handleNotificationEvent(NotificationDto notificationDto){
        NotificationDto.TypeEnum notificationType = notificationDto.getType();
        log.info("Received {} type of notification", notificationType.getValue());
        //TODO: Add your business logic here
    }
}

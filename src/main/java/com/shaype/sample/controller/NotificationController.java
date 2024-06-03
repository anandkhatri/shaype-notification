package com.shaype.sample.controller;

import com.shaype.sample.processor.EventNotificationHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import shaype.openapi.example.api.ApiApi;
import shaype.openapi.example.model.NotificationDto;

@Slf4j
@RestController
@RequiredArgsConstructor
public class NotificationController implements ApiApi {

    private final EventNotificationHandler eventNotificationHandler;

    @Override
    public ResponseEntity<Void> notifyNotification(NotificationDto notificationDto) {
        log.info("Received Shaype notification of type: {}", notificationDto.getType().getValue());
        eventNotificationHandler.processEventNotification(notificationDto);
        return ResponseEntity.ok().build();
    }
}

package com.example.demo.controller;

import com.example.demo.service.NotificationService;
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

    private final NotificationService notificationService;

    @Override
    public ResponseEntity<Void> notifyNotification(NotificationDto notificationDto) {
        log.info("NotifyNotification endpoint invoke");
        notificationService.handleNotificationEvent(notificationDto);
        return ResponseEntity.ok().build();
    }
}

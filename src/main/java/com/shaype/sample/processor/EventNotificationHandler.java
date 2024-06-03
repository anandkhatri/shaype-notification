package com.shaype.sample.processor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import shaype.openapi.example.model.NotificationDto;

import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventNotificationHandler {

    private final Map<NotificationDto.TypeEnum, EventNotificationProcessor> notificationHandlerMap;

    public void processEventNotification(NotificationDto notification) {
        EventNotificationProcessor processor = getNotificationHandler(notification.getType());
        processor.process(notification);
    }

    private EventNotificationProcessor getNotificationHandler(NotificationDto.TypeEnum eventType) {
        return notificationHandlerMap.get(eventType);
    }
}

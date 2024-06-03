package com.shaype.sample.processor;

import shaype.openapi.example.model.NotificationDto;

public interface EventNotificationProcessor {
    void process(NotificationDto notification);
}

package com.shaype.sample.config;

import com.shaype.sample.processor.AccountStatusChangeEventProcessor;
import com.shaype.sample.processor.CustomerStatusUpdatedEventProcessor;
import com.shaype.sample.processor.EventNotificationProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shaype.openapi.example.model.NotificationDto;

import java.util.EnumMap;
import java.util.Map;

@Configuration
public class EventNotificationConfig {

    @Bean
    public Map<NotificationDto.TypeEnum, EventNotificationProcessor> notificationHandlerMap(
            CustomerStatusUpdatedEventProcessor customerStatusUpdatedEventProcessor,
            AccountStatusChangeEventProcessor accountStatusChangeEventProcessor) {
        Map<NotificationDto.TypeEnum, EventNotificationProcessor> map = new EnumMap<>(NotificationDto.TypeEnum.class);
        map.put(NotificationDto.TypeEnum.CUSTOMER_STATUS_UPDATED, customerStatusUpdatedEventProcessor);
        map.put(NotificationDto.TypeEnum.ACCOUNT_STATUS_CHANGE, accountStatusChangeEventProcessor);
        return map;
    }
}

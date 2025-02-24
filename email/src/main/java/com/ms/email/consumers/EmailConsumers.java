package com.ms.email.consumers;

import com.ms.email.dtos.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumers {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {  //atalho para class CTRL+ESPAÇO
        System.out.println(emailRecordDto.emailTo());
    }
}
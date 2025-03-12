package com.ms.email.consumers;

import com.ms.email.dtos.EmailRecordDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumers {
    //ANOTACOES
    @RabbitListener(queues = "${broker.queue.email.name}")
    //ATALHO para class CTRL+ESPACO
    public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
        System.out.println(emailRecordDto.emailTo());
    }
}
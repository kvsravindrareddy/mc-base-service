package org.acme.service;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MessageService {

    @Inject
    private Producer<String, String> producer;

    @Inject
    private Consumer<String, String> consumer;

    public void publisMessage(final @NotEmpty String topicName,
                                final @NotNull String message) {
        ProducerRecord<String, String> record = new ProducerRecord<>(topicName, message);
        producer.send(record);
    }
}
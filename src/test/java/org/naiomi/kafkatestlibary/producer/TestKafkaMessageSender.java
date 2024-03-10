package org.naiomi.kafkatestlibary.producer;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestKafkaMessageSender {

    @Test
    public void testSendMessage() throws IOException {
        String bootstrapServers = "localhost:9092"; // replace with your actual bootstrap servers
        String topicName = "my-test-topic"; // replace with your actual topic name
        KafkaMessageSender kafkaTestMessageSender = new KafkaMessageSender();
        kafkaTestMessageSender.sendMessage("Test message");
        kafkaTestMessageSender.close();
    }
}

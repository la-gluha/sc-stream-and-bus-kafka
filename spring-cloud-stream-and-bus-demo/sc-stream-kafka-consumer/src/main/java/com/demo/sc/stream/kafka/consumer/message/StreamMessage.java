package com.demo.sc.stream.kafka.consumer.message;

public class StreamMessage {
    private Integer id;

    public StreamMessage() {
    }

    public StreamMessage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StreamMessage{" +
                "id=" + id +
                '}';
    }
}

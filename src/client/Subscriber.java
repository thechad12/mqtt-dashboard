package com.mqtt.reader.client;

import org.eclipse.paho.mqttv3.MqttMessage;
import org.eclipse.paho.mqttv3.MqttCallback;
import org.eclipse.paho.mqttv3.MqttException;
import org.eclipse.paho.mqttv3.MqttAsyncClient;
import org.eclipse.paho.mqttv3.MemoryPersistence;
import org.eclipse.paho.mqttv3.IMqttDeliveryToken;

import java.lang.Throwable;
import java.util.UUID;


public class Subscriber implements MqttCallback {

    private String serverURI;
    private MqttAsyncClient client;
    private String clientID = UUID.randomUUID().toString();

    public Subscriber(String serverURI) throws MqttException {
        this.serverURI = serverURI;
        this.client = new MqttAsyncClient(serverURI,clientID,new MemoryPersistence());
        this.client.setCallback(this);
        this.client.connect();
    }

    @Override
    public void connectionLost(Throwable ex) {

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

    }

    @Override
    public void messageArrived(String topic, MqttMessage message) {

    }
}
import org.eclipse.paho.mqttv3.MqttAsyncClient;
import org.eclipse.paho.mqttv3.MqttConnectOptions;

import java.util.UUID;

public class MQTTSub extends MqttAsyncClient {

    private String serverURI;
    private String clientID = UUID.randomUUID().toString();

    public MQTTSub(String serverURI) {
        this.serverURI = serverURI;
        super(this.serverURI,this.clientID);
        super.connect();
    }

    
}
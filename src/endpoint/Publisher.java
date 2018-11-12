
package endpoint;
import ws.PaymentImpl;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:3003/services/generate_payment", new PaymentImpl());
    }
}

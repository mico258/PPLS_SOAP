package ws;

import javax.jws.WebService;
import java.util.Random;

@WebService(endpointInterface = "ws.Payment")
public class PaymentImpl implements Payment {
    @Override
    public String generatePaymentCode(String tipe, String Deskripsi, int jumlahpembayaran) {
        Random random = new Random();
        return tipe+Integer.toString(jumlahpembayaran);
    }
}

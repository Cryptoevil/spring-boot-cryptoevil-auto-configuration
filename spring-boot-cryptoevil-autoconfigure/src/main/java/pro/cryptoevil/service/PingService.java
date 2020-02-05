package pro.cryptoevil.service;

import lombok.AllArgsConstructor;
import pro.cryptoevil.model.response.PingResponse;

@AllArgsConstructor
public class PingService {

    public PingResponse ping() {
        PingResponse response = new PingResponse(100, "OK", System.currentTimeMillis());
        response.setTimeInMillis(56000L);
        return response;
    }
}

package pro.cryptoevil.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PingResponse extends BaseResponse {

    public PingResponse(int code, String message, long timestamp) {
        super(code, message, timestamp);
    }

    private long timeInMillis;
}

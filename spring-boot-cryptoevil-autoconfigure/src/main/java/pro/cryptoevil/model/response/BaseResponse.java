package pro.cryptoevil.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseResponse {

    private int code;
    private String message;
    private long timestamp;
}

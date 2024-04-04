package dagsan.tech.ecommerce.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private Date time = new Date();
    private String msg;
    private String url;

    public ApiResponse(String msg, String url){
        this.msg = msg;
        this.url = url.replace("uri=", "");
    }
}

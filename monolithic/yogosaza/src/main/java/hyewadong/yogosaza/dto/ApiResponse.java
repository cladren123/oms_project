package hyewadong.yogosaza.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ApiResponse {

    private boolean success;
    private List<String> message;

    public ApiResponse(boolean success, List<String> message) {
        this.success = success;
        this.message = message;
    }
}

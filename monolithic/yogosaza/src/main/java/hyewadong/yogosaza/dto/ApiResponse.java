package hyewadong.yogosaza.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ApiResponse {

    private boolean success;
    private String message;


}

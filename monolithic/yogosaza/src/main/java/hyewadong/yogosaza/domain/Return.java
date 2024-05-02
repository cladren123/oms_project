package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Return {

    private Integer returnSeq;
    private Integer memberSeq;
    private Integer orderSeq;
    private String itemCode;
    private Integer returnQty;
    private LocalDateTime returnCreateDate;

    public void makeDate() {
        returnCreateDate = LocalDateTime.now();
    }

}

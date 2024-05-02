package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class PayDomain {

    private Integer paySeq;
    private Integer orderSeq;
    private String payType;
    private String payCardNo;
    private Integer payPrice;
    private LocalDateTime payCreateDate;

    public void makeDate() {
        this.payCreateDate = LocalDateTime.now();
    }

}

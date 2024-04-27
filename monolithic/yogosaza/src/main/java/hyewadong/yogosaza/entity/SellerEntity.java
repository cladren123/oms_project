package hyewadong.yogosaza.entity;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SellerEntity {

    private Integer sellerSeq;
    private Integer brandSeq;
    private String sellerId;
    private String sellerPwd;
    private String sellerName;
    private String sellerPhone;
    private String sellerAddress;
    private LocalDateTime sellerCreateDate;

    public void makeDate() {
        sellerCreateDate = LocalDateTime.now();
    }

}

package hyewadong.yogosaza.dto.seller;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SellerInputDto {

    private Integer brandSeq;
    private String sellerId;
    private String sellerPwd;
    private String sellerName;
    private String sellerPhone;
    private String sellerAddress;

}

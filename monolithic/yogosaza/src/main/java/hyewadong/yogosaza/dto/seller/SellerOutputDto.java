package hyewadong.yogosaza.dto.seller;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class SellerOutputDto {

    private Integer sellerSeq;
    private Integer brandSeq;
    private String sellerId;
    private String sellerName;
    private String sellerPhone;
    private String sellerAddress;
    private LocalDateTime sellerCreateDate;

}

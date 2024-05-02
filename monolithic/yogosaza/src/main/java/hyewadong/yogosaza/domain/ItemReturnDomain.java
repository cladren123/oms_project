package hyewadong.yogosaza.domain;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ItemReturnDomain {

    private Integer itemReturnSeq;
    private Integer memberSeq;
    private Integer orderSeq;
    private String itemCode;
    private Integer itemReturnQty;
    private LocalDateTime itemReturnCreateDate;

    public void makeDate() {
        itemReturnCreateDate = LocalDateTime.now();
    }

}

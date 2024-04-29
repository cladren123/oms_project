package hyewadong.yogosaza.dto.item;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemInputDto {

    private Integer itemSeq;
    private Integer brandSeq;
    private Integer categoryId;
    private String itemCode;
    private String itemName;
    private Integer itemPrice;
    private String itemColor;
    private String itemSize;

}

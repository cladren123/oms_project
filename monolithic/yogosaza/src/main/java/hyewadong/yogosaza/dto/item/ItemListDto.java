package hyewadong.yogosaza.dto.item;


import lombok.Builder;
import lombok.Data;

/*
아이템 리스트에서 사용하는 DTO

일련번호, 이름, 가격, 브랜드이름
 */

@Data
@Builder
public class ItemListDto {

    private Integer itemSeq;
    private String brandName;
    private String itemName;
    private Integer itemPrice;

}

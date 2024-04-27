package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.seller.SellerInputDto;
import hyewadong.yogosaza.entity.SellerEntity;

public class SellerConverter {

    public static SellerEntity sellerInputDtoToSellerEntity(SellerInputDto sellerInputDto) {
        return SellerEntity.builder()
                .brandSeq(sellerInputDto.getBrandSeq())
                .sellerId(sellerInputDto.getSellerId())
                .sellerPwd(sellerInputDto.getSellerPwd())
                .sellerName(sellerInputDto.getSellerName())
                .sellerPhone(sellerInputDto.getSellerPhone())
                .sellerAddress(sellerInputDto.getSellerAddress())
                .build();
    }

}

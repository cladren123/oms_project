package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.domain.PayDomain;
import hyewadong.yogosaza.dto.pay.PayInputDto;

public class PayConverter {

    public static PayDomain payInputDtoToPayDomain(PayInputDto payInputDto) {
        return PayDomain.builder()
                .paySeq(payInputDto.getPaySeq())
                .orderSeq(payInputDto.getOrderSeq())
                .payType(payInputDto.getPayType())
                .payCardNo(payInputDto.getPayCardNo())
                .payPrice(payInputDto.getPayPrice())
                .build();
    }

}

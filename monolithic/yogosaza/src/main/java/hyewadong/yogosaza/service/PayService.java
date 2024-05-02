package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.PayConverter;
import hyewadong.yogosaza.domain.PayDomain;
import hyewadong.yogosaza.dto.pay.PayInputDto;
import hyewadong.yogosaza.dto.pay.PayOutputDto;
import hyewadong.yogosaza.mapper.PayMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PayService {

    private final PayMapper payMapper;

    // 결제 등록
    public int registerPay(PayInputDto payInputDto) throws SQLException {
        PayDomain payDomain = PayConverter.payInputDtoToPayDomain(payInputDto);
        payDomain.makeDate();
        return payMapper.registerPay(payDomain);
    }

    // 결제 상세 조회
    public PayOutputDto getPay(int paySeq) throws SQLException {
        return payMapper.getPay(paySeq);
    }

    // 결제 전체 조회
    public List<PayOutputDto> getPays() throws SQLException {
        return payMapper.getPays();
    }

    // 결제 수정
    public int updatePay(PayInputDto payInputDto) throws SQLException {
        PayDomain payDomain = PayConverter.payInputDtoToPayDomain(payInputDto);
        payDomain.makeDate();
        return payMapper.updatePay(payDomain);
    }

}

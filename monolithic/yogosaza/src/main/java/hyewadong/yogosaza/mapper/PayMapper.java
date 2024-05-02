package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.domain.PayDomain;
import hyewadong.yogosaza.dto.pay.PayOutputDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface PayMapper {

    // 결제 등록
    public int registerPay(PayDomain payDomain) throws SQLException;

    // 결제 조회
    public PayOutputDto getPay(int paySeq) throws SQLException;

    // 결제 전체 조회
    public List<PayOutputDto> getPays() throws SQLException;

    // 결제 수정
    public int updatePay(PayDomain payDomain) throws SQLException;




}

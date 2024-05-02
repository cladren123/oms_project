package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.domain.KpiDomain;
import hyewadong.yogosaza.dto.kpi.KpiOutputDto;
import hyewadong.yogosaza.dto.pay.PayOutputDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface KpiMapper {

    // 실적 등록
    public int registerKpi(KpiDomain kpiDomain) throws SQLException;

    // 실적 조회
    public KpiOutputDto getKpi(int kpiSeq) throws SQLException;

    // 실적 전체 조회
    public List<KpiOutputDto> getKpis() throws SQLException;

    // 실적 수정
    public int updateKpi(KpiDomain kpiDomain) throws SQLException;

}

package hyewadong.yogosaza.service;

import hyewadong.yogosaza.converter.KpiConverter;
import hyewadong.yogosaza.domain.KpiDomain;
import hyewadong.yogosaza.dto.kpi.KpiInputDto;
import hyewadong.yogosaza.dto.kpi.KpiOutputDto;
import hyewadong.yogosaza.mapper.KpiMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class KpiService {

    private final KpiMapper kpiMapper;


    // 실적 등록
    public int registerKpi(KpiInputDto kpiInputDto) throws SQLException {
        KpiDomain kpiDomain = KpiConverter.kpiInputDtoToKpiDomain(kpiInputDto);
        kpiDomain.makeDate();
        return kpiMapper.registerKpi(kpiDomain);
    }

    // 실적 상세 조회
    public KpiOutputDto getKpi(int kpiSeq) throws SQLException {
        return kpiMapper.getKpi(kpiSeq);
    }

    // 실적 전체 조회
    public List<KpiOutputDto> getKpis() throws SQLException {
        return kpiMapper.getKpis();
    }

    // 실적 수정
    public int updateKpi(KpiInputDto kpiInputDto) throws SQLException {
        KpiDomain kpiDomain = KpiConverter.kpiInputDtoToKpiDomain(kpiInputDto);
        kpiDomain.makeDate();
        return kpiMapper.updateKpi(kpiDomain);
    }

}

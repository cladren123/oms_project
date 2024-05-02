package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.domain.KpiDomain;
import hyewadong.yogosaza.dto.kpi.KpiInputDto;

public class KpiConverter {

    public static KpiDomain kpiInputDtoToKpiDomain(KpiInputDto kpiInputDto) {
        return KpiDomain.builder()
                .kpiSeq(kpiInputDto.getKpiSeq())
                .orderSeq(kpiInputDto.getOrderSeq())
                .brandSeq(kpiInputDto.getBrandSeq())
                .itemSeq(kpiInputDto.getItemSeq())
                .kpiPrice(kpiInputDto.getKpiPrice())
                .build();
    }


}

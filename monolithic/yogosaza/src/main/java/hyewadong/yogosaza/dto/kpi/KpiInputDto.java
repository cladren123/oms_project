package hyewadong.yogosaza.dto.kpi;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class KpiInputDto {

    private Integer kpiSeq;
    private Integer orderSeq;
    private Integer brandSeq;
    private Integer itemSeq;
    private Integer kpiPrice;


}

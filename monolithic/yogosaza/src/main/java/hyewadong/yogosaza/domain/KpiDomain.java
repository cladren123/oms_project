package hyewadong.yogosaza.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class KpiDomain {

    private Integer kpiSeq;
    private Integer orderSeq;
    private Integer brandSeq;
    private Integer itemSeq;
    private Integer kpiPrice;
    private LocalDateTime kpiCreateDate;

    public void makeDate() {
        this.kpiCreateDate = LocalDateTime.now();
    }

}

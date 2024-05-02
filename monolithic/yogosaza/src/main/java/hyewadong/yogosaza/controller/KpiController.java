package hyewadong.yogosaza.controller;

import hyewadong.yogosaza.dto.kpi.KpiInputDto;
import hyewadong.yogosaza.dto.kpi.KpiOutputDto;
import hyewadong.yogosaza.dto.pay.PayInputDto;
import hyewadong.yogosaza.dto.pay.PayOutputDto;
import hyewadong.yogosaza.service.KpiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kpi")
public class KpiController {

    private final KpiService kpiService;


    // 실적 등록
    @PostMapping("/new")
    public ResponseEntity<?> registerKpi(@RequestBody KpiInputDto kpiInputDto) throws SQLException {
        int result = kpiService.registerKpi(kpiInputDto);
        return ResponseEntity.ok(result);
    }

    // 실적 상세 조회
    @GetMapping("")
    public ResponseEntity<?> getPay(@RequestParam int kpiSeq) throws SQLException {
        KpiOutputDto result = kpiService.getKpi(kpiSeq);
        return ResponseEntity.ok(result);
    }

    // 실적 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getKpis() throws SQLException {
        List<KpiOutputDto> result = kpiService.getKpis();
        return ResponseEntity.ok(result);
    }

    // 실적 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateKpi(@RequestBody KpiInputDto kpiInputDto) throws SQLException {
        int result = kpiService.updateKpi(kpiInputDto);
        return ResponseEntity.ok(result);
    }




}

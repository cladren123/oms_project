package hyewadong.yogosaza.service;


import hyewadong.yogosaza.mapper.StockMapper;
import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.dto.stock.StockOutputDto;
import hyewadong.yogosaza.entity.StockDomain;
import hyewadong.yogosaza.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StockService {

    private final StockRepository stockRepository;

    // 재고 등록 
    public int registerStock(StockInputDto stockInputDto) throws SQLException {
        StockDomain stockDomain = StockMapper.stockInputDtoToStockDomain(stockInputDto);
        return stockRepository.registerStock(stockDomain);
    }

    // 재고 상세 조회
    public StockOutputDto getStock(int stockSeq) throws SQLException {
        StockOutputDto result = stockRepository.getStock(stockSeq);
        return result;
    }

    // 재고 전체 조회
    public List<StockOutputDto> getStocks() throws SQLException {
        return stockRepository.getStocks();
    }

    // 재고 수정
    public int updateStock(StockInputDto stockInputDto) throws SQLException {
        return stockRepository.updateStock(stockInputDto);
    }



}

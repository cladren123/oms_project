package hyewadong.yogosaza.service;


import hyewadong.yogosaza.controller.StockHistoryController;
import hyewadong.yogosaza.converter.StockHistoryConverter;
import hyewadong.yogosaza.domain.StockHistoryDomain;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryInputDto;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryOutputDto;
import hyewadong.yogosaza.mapper.StockHistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StockHistoryService {

    private final StockHistoryMapper stockHistoryMapper;

    // 재고 내역 등록
    public int registerStockHistory(StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        StockHistoryDomain stockHistoryDomain = StockHistoryConverter.stockHistoryInputDtoToStockHistoryDomain(stockHistoryInputDto);
        stockHistoryDomain.makeDate();
        return stockHistoryMapper.registerStockHistory(stockHistoryDomain);
    }

    // 재고 내역 조회
    public StockHistoryOutputDto getStockHistory(int stockHistorySeq) throws SQLException {
        return stockHistoryMapper.getStockHistory(stockHistorySeq);
    }

    // 재고 내역 전체 조회
    public List<StockHistoryOutputDto> getStockHistories() throws SQLException {
        return stockHistoryMapper.getStockHistories();
    }

    // 상품별 재고 내역 전체 조회
    public List<StockHistoryOutputDto> getStockHistoriesByItemSeq(int itemSeq) throws SQLException {
        return stockHistoryMapper.getStockHistoriesByItemSeq(itemSeq);
    }

    // 재고 내역 수정
    public int updateStockHistory(StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        StockHistoryDomain stockHistoryDomain = StockHistoryConverter.stockHistoryInputDtoToStockHistoryDomain(stockHistoryInputDto);
        stockHistoryDomain.makeDate();
        return stockHistoryMapper.updateStockHistory(stockHistoryDomain);
    }

    // 재고 내역 삭제
    public int deleteStockHistory(StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        return stockHistoryMapper.deleteStockHistory(stockHistoryInputDto);
    }



    // 재고 수정 시 재고 내역 저장(프로시저 사용)
    public void updateStockFromStockHistory(StockHistoryInputDto stockHistoryInputDto) throws SQLException {
        StockHistoryDomain stockHistoryDomain = StockHistoryConverter.stockHistoryInputDtoToStockHistoryDomain(stockHistoryInputDto);
        stockHistoryDomain.makeDate();
        stockHistoryMapper.updateStockFromStockHistory(stockHistoryDomain);
    }





}

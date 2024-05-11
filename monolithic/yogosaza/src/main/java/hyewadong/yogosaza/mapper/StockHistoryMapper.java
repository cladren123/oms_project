package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.domain.StockHistoryDomain;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryInputDto;
import hyewadong.yogosaza.dto.stockHistory.StockHistoryOutputDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface StockHistoryMapper {

    // 재고 내역 등록
    public int registerStockHistory(StockHistoryDomain stockHistoryDomain) throws SQLException;

    // 재고 내역 조회
    public StockHistoryOutputDto getStockHistory(int stockHistorySeq) throws SQLException;

    // 재고 내역 전체 조회
    public List<StockHistoryOutputDto> getStockHistories() throws SQLException;

    // 상품별 재고 내역 조회
    public List<StockHistoryOutputDto> getStockHistoriesByItemSeq(int itemSeq) throws SQLException;

    // 재고 내역 수정
    public int updateStockHistory(StockHistoryDomain stockHistoryDomain) throws SQLException;

    // 재고 내역 삭제
    public int deleteStockHistory(StockHistoryInputDto stockHistoryInputDto) throws SQLException;



    // 재고 수정 시 재고 내역 저장(프로시저 사용)
    public void updateStockFromStockHistory(StockHistoryDomain stockHistoryDomain) throws SQLException;


}

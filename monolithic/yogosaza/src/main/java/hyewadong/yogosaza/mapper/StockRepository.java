package hyewadong.yogosaza.mapper;

import hyewadong.yogosaza.dto.stock.StockInputDto;
import hyewadong.yogosaza.dto.stock.StockOutputDto;
import hyewadong.yogosaza.entity.StockDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface StockRepository {

    // 재고 등록
    public int registerStock(StockDomain stockDomain) throws SQLException;

    // 재고 조회
    public StockOutputDto getStock(int stockSeq) throws SQLException;

    // 재고 전체 조회
    public List<StockOutputDto> getStocks() throws SQLException;

    // 재고 수정
    public int updateStock(StockInputDto stockInputDto) throws SQLException;


}

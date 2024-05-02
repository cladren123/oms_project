package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.dto.seller.SellerInputDto;
import hyewadong.yogosaza.dto.seller.SellerOutputDto;
import hyewadong.yogosaza.entity.SellerDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface SellerRepository {

    // 판매자 가입
    public int registerSeller(SellerDomain sellerDomain) throws SQLException;

    // 판매자 상세 조회
    public SellerOutputDto getSeller(int sellerSeq) throws SQLException;

    // 판매자 전부 조회
    public List<SellerOutputDto> getSellers() throws SQLException;

    // 판매자 정보 수정
    public int updateSeller(SellerInputDto sellerInputDto) throws SQLException;

    // 판매자 삭제
    public int deleteSeller(int sellerSeq) throws SQLException;

}

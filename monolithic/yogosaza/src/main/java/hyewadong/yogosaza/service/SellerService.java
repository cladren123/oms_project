package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.SellerConverter;
import hyewadong.yogosaza.dto.seller.SellerInputDto;
import hyewadong.yogosaza.dto.seller.SellerOutputDto;
import hyewadong.yogosaza.entity.SellerDomain;
import hyewadong.yogosaza.mapper.SellerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SellerService {

    private final SellerMapper sellerMapper;

    // 판매자 가입
    public int registerSeller(SellerInputDto sellerInputDto) throws SQLException {
        SellerDomain sellerDomain = SellerConverter.sellerInputDtoToSellerEntity(sellerInputDto);
        sellerDomain.makeDate();
        return sellerMapper.registerSeller(sellerDomain);
    }

    // 판매자 상세 조회
    public SellerOutputDto getSeller(int sellerSeq) throws SQLException {
        return sellerMapper.getSeller(sellerSeq);
    }

    // 판매자 전체 조회
    public List<SellerOutputDto> getSellers() throws SQLException {
        return sellerMapper.getSellers();
    }

    // 판매자 정보 수정
    public int updateSeller(SellerInputDto sellerInputDto) throws SQLException {
        return sellerMapper.updateSeller(sellerInputDto);
    }

    // 판매자 삭제
    public int deleteSeller(SellerInputDto sellerInputDto) throws SQLException {
        return sellerMapper.deleteSeller(sellerInputDto.getSellerSeq());
    }



}

package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.MemberConverter;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.seller.SellerInputDto;
import hyewadong.yogosaza.entity.MemberEntity;
import hyewadong.yogosaza.mapper.SellerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SellerSerivce {

    private final SellerMapper sellerMapper;

    // 판매자 가입
    public int registerSeller(SellerInputDto sellerInputDto) throws SQLException {
        MemberEntity memberEntity = MemberConverter.memberRegisterDtoToMemberEntity(memberInputDto);
        memberEntity.setMemberCreateDate(LocalDateTime.now());
        return memberMapper.registerMember(memberEntity);
    }

    // 판매자 상세 조회
    public MemberOutputDto getSeller(int memberSeq) throws SQLException {
        return memberMapper.getMember(memberSeq);
    }

    // 판매자 전체 조회
    public List<MemberOutputDto> getSellers() throws SQLException {
        return memberMapper.getMembers();
    }

    // 판매자 정보 수정
    public int updateseller(MemberInputDto memberInputDto) throws SQLException {
        return memberMapper.updateMember(memberInputDto);
    }

    // 판매자 삭제
    public int deleteSeller(MemberInputDto memberInputDto) throws SQLException {
        return memberMapper.deleteMember(memberInputDto.getMemberSeq());
    }



}

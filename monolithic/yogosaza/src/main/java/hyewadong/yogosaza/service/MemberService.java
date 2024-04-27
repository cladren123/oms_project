package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.MemberConverter;
import hyewadong.yogosaza.dto.MemberGetDto;
import hyewadong.yogosaza.dto.MemberRegisterDto;
import hyewadong.yogosaza.entity.MemberEntity;
import hyewadong.yogosaza.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    // 회원 가입
    public int registerMember(MemberRegisterDto memberRegisterDto) throws SQLException {
        MemberEntity memberEntity = MemberConverter.memberRegisterDtoToMemberEntity(memberRegisterDto);
        memberEntity.setMemberCreateDate(LocalDateTime.now());
        return memberMapper.registerMember(memberEntity);
    }

    // 회원 상세 조회
    public MemberGetDto getMember(int memberSeq) throws SQLException {
        return memberMapper.getMember(memberSeq);
    }

}

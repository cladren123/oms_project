package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.MemberConverter;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.entity.MemberDomain;
import hyewadong.yogosaza.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberMapper memberMapper;

    // 회원 가입
    public int registerMember(MemberInputDto memberInputDto) throws SQLException {
        MemberDomain memberDomain = MemberConverter.memberRegisterDtoToMemberDomain(memberInputDto);
        memberDomain.setMemberCreateDate(LocalDateTime.now());
        return memberMapper.registerMember(memberDomain);
    }

    // 회원 상세 조회
    public MemberOutputDto getMember(int memberSeq) throws SQLException {
        return memberMapper.getMember(memberSeq);
    }

    // 회원 전체 조회
    public List<MemberOutputDto> getMembers() throws SQLException {
        return memberMapper.getMembers();
    }

    // 회원 정보 수정
    public int updateMember(MemberInputDto memberInputDto) throws SQLException {
        return memberMapper.updateMember(memberInputDto);
    }

    // 회원 삭제
    public int deleteMember(MemberInputDto memberInputDto) throws SQLException {
        return memberMapper.deleteMember(memberInputDto.getMemberSeq());
    }

}

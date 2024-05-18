package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.MemberConverter;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.domain.MemberDomain;
import hyewadong.yogosaza.dto.member.MemberRegisterDto;
import hyewadong.yogosaza.exception.ConflictException;
import hyewadong.yogosaza.mapper.MemberMapper;
import hyewadong.yogosaza.message.DtoMessage;
import hyewadong.yogosaza.message.ErrorMessage;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Around;
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
    @Around("trackRegisterMemberTime()")
    public int registerMember(MemberRegisterDto memberRegisterDto) throws SQLException {

        // 아이디 중복 검사
        if (memberMapper.existsByMemberId(memberRegisterDto.getMemberId())) {
            throw new ConflictException(ErrorMessage.ID_ALREADY_TAKEN.getMessage());
        }

        MemberDomain memberDomain = MemberConverter.memberRegistDtoToMemberDomain(memberRegisterDto);
        memberDomain.makeDate();

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

package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.dto.member.MemberLoginDto;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.domain.MemberDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface MemberMapper {

    // 회원 가입
    public int registerMember(MemberDomain memberDomain) throws SQLException;


    // 회원 아이디 중복 확인
    public boolean existsByMemberId(String memberId) throws SQLException;

    // 로그인 : 아이디, 비밀번호 비교
    public MemberDomain getMemberByMemberIdAndMemberPwd(MemberLoginDto memberLoginDto) throws SQLException;

    // 회원 상세 조회
    public MemberOutputDto getMember(int memberSeq) throws SQLException;

    // 회원 전부 조회
    public List<MemberOutputDto> getMembers() throws SQLException;

    // 회원 정보 수정
    public int updateMember(MemberInputDto memberInputDto) throws SQLException;

    // 회원 삭제
    public int deleteMember(int memberSeq) throws SQLException;



}

package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.entity.MemberDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface MemberRepository {

    // 회원 가입
    public int registerMember(MemberDomain memberDomain) throws SQLException;

    // 회원 상세 조회
    public MemberOutputDto getMember(int memberSeq) throws SQLException;

    // 회원 전부 조회
    public List<MemberOutputDto> getMembers() throws SQLException;

    // 회원 정보 수정
    public int updateMember(MemberInputDto memberInputDto) throws SQLException;

    // 회원 삭제
    public int deleteMember(int memberSeq) throws SQLException;



}

package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.dto.MemberGetDto;
import hyewadong.yogosaza.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface MemberMapper {

    // 회원 가입
    public int registerMember(MemberEntity memberEntity) throws SQLException;

    // 회원 상세 조회
    public MemberGetDto getMember(int memberSeq) throws SQLException;

    // 회원 전부 조회
//    public List<MemberEntity> getMembers() throws SQLException;
//
//    // 회원 정보 수정
//    public int updateMember(MemberEntity memberEntity) throws SQLException;
//
//    // 회원 삭제
//    public int deleteMember(int memberSeq) throws SQLException;



}

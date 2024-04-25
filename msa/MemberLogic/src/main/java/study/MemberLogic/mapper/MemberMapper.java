package study.MemberLogic.mapper;


import org.apache.ibatis.annotations.Mapper;
import study.MemberLogic.entity.MemberEntity;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface MemberMapper {

    // 멤버 가입
    public int registerMember(MemberEntity memberEntity) throws SQLException;

    // 멤버 조회
    public MemberEntity getMember(int seq) throws SQLException;

    // 전부 조회
    public List<MemberEntity> getMembers() throws SQLException;

    // 멈베 수정
    public int modifyMember(MemberEntity memberEntity) throws SQLException;

    // 멤버 삭제
    public int removeMember(int seq) throws SQLException;

}

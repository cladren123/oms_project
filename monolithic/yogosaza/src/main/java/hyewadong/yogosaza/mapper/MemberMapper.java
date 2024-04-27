package hyewadong.yogosaza.mapper;


import hyewadong.yogosaza.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface MemberMapper {

    // 회원 가입
    public int registerMember(MemberEntity memberEntity) throws SQLException;



}

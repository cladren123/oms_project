package hyewadong.yogosaza.service;


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
    public int registerMember(MemberEntity memberEntity) throws SQLException {
        memberEntity.setMemberCreateDate(LocalDateTime.now());
        return memberMapper.registerMember(memberEntity);
    }

}

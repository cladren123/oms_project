package study.MemberLogic.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.MemberLogic.entity.MemberEntity;
import study.MemberLogic.mapper.MemberMapper;

import java.sql.SQLException;
import java.util.List;


@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /* 회원 가입 */
    public int registerMember(MemberEntity memberEntity) throws SQLException {
        return memberMapper.registerMember(memberEntity);
    }

    /* 회원 조회 */
    public MemberEntity getMember(int seq) throws SQLException {
        return memberMapper.getMember(seq);
    }

    /* 회원 전부 조회 */
    public List<MemberEntity> getMembers() throws SQLException {
        return memberMapper.getMembers();
    }


    /* 회원 수정 */
    public int modifyMember(MemberEntity memberEntity) throws SQLException {
        return memberMapper.modifyMember(memberEntity);
    }


    /* 회원 삭제 */
    public int removeMember(int seq) throws SQLException {
        return memberMapper.removeMember(seq);
    }

}

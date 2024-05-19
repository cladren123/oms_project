package hyewadong.yogosaza.service;


import hyewadong.yogosaza.converter.MemberConverter;
import hyewadong.yogosaza.dto.member.MemberLoginDto;
import hyewadong.yogosaza.dto.member.MemberOutputDto;
import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.domain.MemberDomain;
import hyewadong.yogosaza.dto.member.MemberRegisterDto;
import hyewadong.yogosaza.exception.ConflictException;
import hyewadong.yogosaza.exception.InvalidCredentialsException;
import hyewadong.yogosaza.mapper.MemberMapper;
import hyewadong.yogosaza.message.DtoMessage;
import hyewadong.yogosaza.message.ErrorMessage;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberMapper memberMapper;

    // 회원 가입
    public int registerMember(MemberRegisterDto memberRegisterDto) throws SQLException {

        // 아이디 중복 검사
        if (memberMapper.existsByMemberId(memberRegisterDto.getMemberId())) {
            throw new ConflictException(ErrorMessage.ID_ALREADY_TAKEN.getMessage());
        }

        MemberDomain memberDomain = MemberConverter.memberRegistDtoToMemberDomain(memberRegisterDto);
        memberDomain.makeDate();

        return memberMapper.registerMember(memberDomain);
    }

    // 로그인 : 아이디 비밀번호 판별 후 토큰 발행
    public String loginMember(MemberLoginDto memberLoginDto) throws SQLException{

        MemberDomain memberDomain = memberMapper.getMemberByMemberIdAndMemberPwd(memberLoginDto);

        // 로그인 실패
        if (memberDomain == null) {
            throw new InvalidCredentialsException(ErrorMessage.LOGIN_FAILED.getMessage());
        }

        // 로그인 성공 : 토큰 발행
        String jwt = generateToken(memberDomain);
        System.out.println("work");
        return jwt;
    }

    // 토큰 생성
    public String generateToken(MemberDomain memberDomain) {
        String secretKey = "0p5j8fXNYvJm63zSKJ96HjUWwhJ7MBJFVwzgHhLX0nM=";
        long expirationTime = 1000 * 60 * 60 * 10; // 10시간
        return Jwts.builder()
                .setSubject(String.valueOf(memberDomain.getMemberSeq()))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime)) // 10시간 후 만료
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
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

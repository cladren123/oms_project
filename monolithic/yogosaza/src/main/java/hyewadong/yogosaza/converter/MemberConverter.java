package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.domain.MemberDomain;
import hyewadong.yogosaza.dto.member.MemberRegisterDto;

public class MemberConverter {

    static public MemberDomain memberInputDtoToMemberDomain(MemberInputDto memberInputDto) {
        return MemberDomain.builder()
                .memberId(memberInputDto.getMemberId())
                .memberPwd(memberInputDto.getMemberPwd())
                .memberName(memberInputDto.getMemberName())
                .memberPhone(memberInputDto.getMemberPhone())
                .memberAddress(memberInputDto.getMemberAddress())
                .build();
    }

    static public MemberDomain memberRegistDtoToMemberDomain(MemberRegisterDto memberRegisterDto) {
        return MemberDomain.builder()
                .memberId(memberRegisterDto.getMemberId())
                .memberPwd(memberRegisterDto.getMemberPwd())
                .memberName(memberRegisterDto.getMemberName())
                .memberPhone(memberRegisterDto.getMemberPhone())
                .memberAddress(memberRegisterDto.getMemberAddress())
                .build();
    }

}

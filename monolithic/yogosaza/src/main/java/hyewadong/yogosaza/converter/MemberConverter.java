package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.member.MemberInputDto;
import hyewadong.yogosaza.entity.MemberDomain;

public class MemberConverter {

    static public MemberDomain memberRegisterDtoToMemberDomain(MemberInputDto memberInputDto) {
        return MemberDomain.builder()
                .memberId(memberInputDto.getMemberId())
                .memberPwd(memberInputDto.getMemberPwd())
                .memberName(memberInputDto.getMemberName())
                .memberPhone(memberInputDto.getMemberPhone())
                .memberAddress(memberInputDto.getMemberAddress())
                .build();
    }

}

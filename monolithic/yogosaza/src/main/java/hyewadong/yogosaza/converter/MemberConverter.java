package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.MemberRegisterDto;
import hyewadong.yogosaza.entity.MemberEntity;

public class MemberConverter {

    static public MemberEntity memberRegisterDtoToMemberEntity(MemberRegisterDto memberRegisterDto) {
        return MemberEntity.builder()
                .memberId(memberRegisterDto.getMemberId())
                .memberPwd(memberRegisterDto.getMemberPwd())
                .memberName(memberRegisterDto.getMemberName())
                .memberPhone(memberRegisterDto.getMemberPhone())
                .memberAddress(memberRegisterDto.getMemberAddress())
                .build();
    }

}

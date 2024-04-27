package hyewadong.yogosaza.converter;

import hyewadong.yogosaza.dto.MemberInputDto;
import hyewadong.yogosaza.entity.MemberEntity;

public class MemberConverter {

    static public MemberEntity memberRegisterDtoToMemberEntity(MemberInputDto memberInputDto) {
        return MemberEntity.builder()
                .memberId(memberInputDto.getMemberId())
                .memberPwd(memberInputDto.getMemberPwd())
                .memberName(memberInputDto.getMemberName())
                .memberPhone(memberInputDto.getMemberPhone())
                .memberAddress(memberInputDto.getMemberAddress())
                .build();
    }

}

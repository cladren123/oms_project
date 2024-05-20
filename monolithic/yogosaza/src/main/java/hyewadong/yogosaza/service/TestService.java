package hyewadong.yogosaza.service;


import hyewadong.yogosaza.domain.ItemDomain;
import hyewadong.yogosaza.domain.MemberDomain;
import hyewadong.yogosaza.mapper.ItemMapper;
import hyewadong.yogosaza.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 테스트 기능 서비스
 */

@Service
@RequiredArgsConstructor
@Transactional
public class TestService {

    private final MemberMapper memberMapper;
    private final ItemMapper itemMapper;

    private final Random random = new Random();
    private final List<String> districts = Arrays.asList(
            "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구",
            "금천구", "노원구", "도봉구", "동대문구", "동작구", "마포구", "서대문구",
            "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구",
            "은평구", "종로구", "중구", "중랑구"
    );

    // 더미 회원 10_000개 생성
    public void makeDummyMember() throws SQLException {
        for (int i = 1; i <= 10_000; i++) {
            String id = String.format("id%05d", i);
            String pwd = String.format("pwd%05d", i);
            String name = String.format("name%05d", i);
            String phone = String.format("010%08d", i);
            String district = districts.get(random.nextInt(districts.size()));
            String address = "서울시 " + district;
            MemberDomain memberDummy = MemberDomain.builder()
                    .memberId(id)
                    .memberPwd(pwd)
                    .memberName(name)
                    .memberPhone(phone)
                    .memberAddress(address)
                    .build();
            memberDummy.makeDate();
            memberMapper.registerMember(memberDummy);
        }
    }

    private final List<String> colors = Arrays.asList(
            "red", "orange", "yellow", "green", "blue", "navy", "purple",
            "khaki", "beige", "black", "white", "denim"
    );

    private final List<String> sizes = Arrays.asList(
            "XS", "S", "M", "L", "XL", "XXL", "FREE"
    );

    // 상품 10_000개 생성
    public void makeDummyItem() throws SQLException {
        for (int i = 1; i <= 10_000; i++) {
            Integer brandSeq = random.nextInt(10) + 1;
            Integer categoryId = random.nextInt(10) + 1;
            String itemCode = String.format("code%05d", i);
            String itemName = String.format("itemName%05d", i);
            Integer itemPrice = (random.nextInt(100) + 1) * 1000;
            String itemColor = colors.get(random.nextInt(colors.size()));
            String itemSize = sizes.get(random.nextInt(sizes.size()));
            ItemDomain itemDomain = ItemDomain.builder()
                    .brandSeq(brandSeq)
                    .categoryId(categoryId)
                    .itemCode(itemCode)
                    .itemName(itemName)
                    .itemPrice(itemPrice)
                    .itemColor(itemColor)
                    .itemSize(itemSize)
                    .build();
            itemDomain.makeDate();
            itemMapper.registerItem(itemDomain);
        }
    }



}

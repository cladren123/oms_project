package simolfire.studyProject.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import simolfire.studyProject.entity.Brand;
import simolfire.studyProject.entity.Order;
import simolfire.studyProject.entity.Product;
import simolfire.studyProject.entity.User;
import simolfire.studyProject.repository.*;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Map.entry;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final BrandRepository brandRepository;
    private final CategoryRepository categoryRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    private final Map<Integer, String> categories = Map.ofEntries(
            entry(4, "스웨트셔츠"),
            entry(5, "후드티셔츠"),
            entry(6, "셔츠"),
            entry(7, "반소매티셔츠"),
            entry(8, "데님팬츠"),
            entry(9, "코튼팬츠"),
            entry(10, "슬렉스"),
            entry(11, "숏팬츠"),
            entry(12, "블루종"),
            entry(13, "코트"),
            entry(14, "레더재킷"),
            entry(15, "나일론재킷")
    );


    // 더미 브랜드 등록
    public void registerDummyBrand() {
        brandRepository.save(Brand.builder().name("나이키").build());
        brandRepository.save(Brand.builder().name("뉴발란스").build());
        brandRepository.save(Brand.builder().name("비얼디드키드").build());
        brandRepository.save(Brand.builder().name("쿠어").build());
        brandRepository.save(Brand.builder().name("커버낫").build());
        brandRepository.save(Brand.builder().name("유니온블루").build());
        brandRepository.save(Brand.builder().name("드로우핏").build());
        brandRepository.save(Brand.builder().name("어나더오피스").build());
        brandRepository.save(Brand.builder().name("아워스코프").build());
        brandRepository.save(Brand.builder().name("밈더워드로브").build());
    }

    // 더미 유저 1000개 등록
    public void registerDummyUser() {

        for (int i = 0; i < 1000; i++) {
            userRepository.save(User.builder()
                    .loginId("id" + i)
                    .password("pwd" + i)
                    .lastName("김")
                    .firstName("나박" + i)
                    .nickname("별칭" + i)
                    .address("주소" + i)
                    .phoneNumber("01055556666")
                    .email("email" + i + "@google.com")
                    .build());
        }

    }

    // 더미 상품 1000개 등록
    public void registerDummyProduct() {

        // 브랜드 1~10
        // 카테고리 4~15

        System.out.println("work");

        for (int i = 0; i < 1000; i++) {

            Integer brandId = ThreadLocalRandom.current().nextInt(1, 11);
            Integer categoryId = ThreadLocalRandom.current().nextInt(4, 15);
            Integer price = ThreadLocalRandom.current().nextInt(3, 11) * 10000;
            Integer views = ThreadLocalRandom.current().nextInt(20000);

            Product product = Product.builder()
                    .brandId(brandId)
                    .categoryId(categoryId)
                    .name(categories.get(categoryId) + "i")
                    .description(categories.get(categoryId) + "i")
                    .price(price)
                    .views(views)
                    .build();

            productRepository.save(product);
        }

        System.out.println("work end");

    }

    // 더미 주문 10000개 등록
    public void registerDummyOrder() {

        for (int i = 0; i < 10000; i++) {
            Integer userId = ThreadLocalRandom.current().nextInt(1, 1000);
            Integer productId = ThreadLocalRandom.current().nextInt(1, 10000);
            Integer price = ThreadLocalRandom.current().nextInt(3, 11) * 10000;

            Order order = Order.builder()
                    .userId(userId)
                    .productId(productId)
                    .payment(price)
                    .state(0)
                    .build();

            orderRepository.save(order);
        }
    }


}

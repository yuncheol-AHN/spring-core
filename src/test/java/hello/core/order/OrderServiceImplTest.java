package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemeberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceImplTest {

    private MemberService memberService = new MemeberServiceImpl();
    private OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        //given
        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);

        // when
        memberService.join(memberA);
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // then
        Assertions.assertThat(order.getMemberId()).isEqualTo(memberId);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
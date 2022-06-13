package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    MemberService memberService =new MemberServiceImpl();
    OrderService orderService =new OrderServiceimpl();
    @Test
    void createOrder(){
        Long memberId =1L;
        Member 브라이튼 = new Member(memberId, "브라이튼", Grade.Vip);
        memberService.join(브라이튼);
        //when
        Order 고추장 = orderService.createOrder(브라이튼.getId(), "고추장", 3000);
        //then
        Assertions.assertThat(고추장.getDiscountPrice()).isEqualTo(1000);
    }
}

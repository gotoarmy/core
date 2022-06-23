package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceimpl implements  OrderService{
//서비스의존관계주입
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy; //인터페이스에만 의존하도록 변경

    public OrderServiceimpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;

    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member =memberRepository.findById(memberId);//조회를 해서
        int discountPrice =discountPolicy.discount(member,itemPrice);//할인정책쪽에 넘김
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}

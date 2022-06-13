package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceimpl implements  OrderService{
//서비스의존관계주입
    private final MemberRepository memberRepository =new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member =memberRepository.findById(memberId);//조회를 해서
        int discountPrice =discountPolicy.discount(member,itemPrice);//할인정책쪽에 넘김
        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}

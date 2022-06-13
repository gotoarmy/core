package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    //할인 금액을 리턴
    int discount(Member Member, int price);
}

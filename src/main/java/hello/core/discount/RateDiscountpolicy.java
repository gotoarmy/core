package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;


public class RateDiscountpolicy implements DiscountPolicy {
        private int discountPercent = 10; //10% 할인

        @Override
        public int discount(Member member, int price) {
            if (member.getGrade() == Grade.Vip) {
                return price * discountPercent / 100;
            } else {
                return 0;
            }
        }
}


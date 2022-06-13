package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{
    private  int discountFixAmount =1000;//정액 천원할인
    @Override
    public int discount(Member Member, int price) {
        if (Member.getGrade()== Grade.Vip){
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }
}

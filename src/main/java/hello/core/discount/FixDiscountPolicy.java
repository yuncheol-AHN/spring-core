package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final static int fixDiscountCost = 1000;

    @Override
    public int discountCost(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return fixDiscountCost;
        } else {
            return 0;
        }
    }
}

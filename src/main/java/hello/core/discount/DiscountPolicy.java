package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    int discountCost(Member member, int price);
}

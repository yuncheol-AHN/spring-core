package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemeberServiceImplTest {

    private final MemberService memberService = new MemeberServiceImpl();

    @Test
    void joinAndFind() {
        // given
        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);

        // when
        memberService.join(memberA);
        Member findMember = memberService.findMember(memberId);

        // then
        Assertions.assertThat(memberA).isEqualTo(findMember);
    }
}
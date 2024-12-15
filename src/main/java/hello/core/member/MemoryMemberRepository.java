package hello.core.member;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> memberStore = new ConcurrentHashMap<>();

    @Override
    public void save(Member member) {
        memberStore.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return memberStore.get(id);
    }
}

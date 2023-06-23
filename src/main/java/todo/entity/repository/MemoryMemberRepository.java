package todo.entity.repository;

import org.springframework.stereotype.Repository;
import todo.entity.Entity.Member;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryMemberRepository implements MemberRepository{
    private Map<Long, Member> store = new HashMap<>();
    private long sequence = 0L;

    @Override
    public void save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByUserId(String userId) {
        return store.values().stream()
                .filter(member -> member.getUserId().equals(userId))
                .findFirst();
    }
}

package todo.entity.repository;

import todo.entity.Entity.Member;

import java.util.Optional;

public interface MemberRepository {
    void save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByUserId(String userId);
}

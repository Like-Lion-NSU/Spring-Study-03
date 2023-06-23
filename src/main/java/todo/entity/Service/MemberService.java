package todo.entity.Service;

import todo.entity.Dto.MemberDto;

public interface MemberService {
    void registerMember(MemberDto memberDto);
    boolean login(String userId, String password);
}

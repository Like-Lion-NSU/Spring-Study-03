package todo.entity.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import todo.entity.Dto.MemberDto;
import todo.entity.Entity.Member;
import todo.entity.repository.MemberRepository;

public class MemberServicelemp implements MemberService{
    private MemberRepository memberRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public MemberServicelemp(MemberRepository memberRepository, BCryptPasswordEncoder passwordEncoder) {
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerMember(MemberDto memberDto) {
        Member member = new Member();
        member.setUserId(memberDto.getUserId());
        member.setPassword(passwordEncoder.encode(memberDto.getPassword()));
        member.setName(memberDto.getName());

        memberRepository.save(member);
    }

    @Override
    public boolean login(String userId, String password) {
        Member member = memberRepository.findByUserId(userId);
        if (member != null) {
            return passwordEncoder.matches(password, member.getPassword());
        }
        return false;
    }

}

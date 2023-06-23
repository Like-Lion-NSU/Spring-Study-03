package todo.entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import todo.entity.Dto.MemberDto;
import todo.entity.Service.MemberService;

public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody MemberDto memberDto) {
        memberService.registerMember(memberDto);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody MemberDto memberDto) {
        String userId = memberDto.getUserId();
        String password = memberDto.getPassword();
        return memberService.login(userId, password);
    }
}

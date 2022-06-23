package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderServiceimpl;

public class MemberApp {

    public static void main(String[] args) {
        Appconfig appconfig = new Appconfig();
        MemberService memberService = appconfig.memberService(); //요런식으로 추가
        Member member = new Member(1L, "memberA", Grade.Vip);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}

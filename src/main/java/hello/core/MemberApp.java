package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

import java.util.Arrays;

public class MemberApp {

    public static void main(String[] args) {
        MemberService MemberService =new MemberServiceImpl();
        Member someGuy = new Member(1L, "김진수", Grade.Vip);
        MemberService.join(someGuy);
        Member findMember = MemberService.findMember(1L);

        System.out.println("new member =" +someGuy.getName());
        System.out.println("find member =" +findMember.getName());

    }
}

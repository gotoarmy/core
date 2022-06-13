package hello.core.member;

public class MemberServiceImpl implements  MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    //클래스 다이어그램 클라 -->회원서비스 --> MemoryMemberRepository

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

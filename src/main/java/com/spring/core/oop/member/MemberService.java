package com.spring.core.oop.member;

//역할: 적당한(?) 회원 저장소에 저장 명령을 내리는 책임 -> db 인지 메모리인지 클라이언트는 몰라도 된다
public class MemberService {



    //인터페이스와 연계하는 문구
    private MemberRepository memberRepository;//인터페이스와 협력관계 오더내리는곳 : 서비스 /받는곳: 레파지토리

    public MemberService(MemberRepository memberRepository) {
        //memberRepository = new MemoryMemberRepository();
        this.memberRepository = memberRepository;
    }

    //회원가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }



}

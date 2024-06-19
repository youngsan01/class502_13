package choongang.member.mapper;

import choongang.member.entities.Member;

public interface MemberMapper {
    long exist(String email);
    Member get(String email);
    int register(Member member);

}

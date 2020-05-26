package kr.ish.service;

import kr.ish.domain.MemberVO;

public interface MemberService {
	
	public void signIn(MemberVO member);
	
	public MemberVO info(int mno);
	
	public boolean modify(MemberVO member);
	
	public boolean remove(int mno);
	
}

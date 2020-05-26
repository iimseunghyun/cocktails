package kr.ish.mapper;

import kr.ish.domain.MemberVO;

public interface MemberMapper {

	public void insert(MemberVO member);
	
	public void insertSelectKey(MemberVO member);
	
	public MemberVO read(int mno);
	
	public int update(MemberVO member);
	
	public int delete(int mno);
	
}

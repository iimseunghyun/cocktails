package kr.ish.mapper;

import kr.ish.domain.MemberVO;

public interface AdminMapper {
	
	public MemberVO read(int mno);

	public void insert(MemberVO member);

}

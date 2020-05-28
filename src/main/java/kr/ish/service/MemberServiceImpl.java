package kr.ish.service;

import org.springframework.stereotype.Service;

import kr.ish.domain.MemberVO;
import kr.ish.mapper.MemberMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor

public class MemberServiceImpl implements MemberService {
	
	private MemberMapper mapper;
	
	@Override
	public void signUp(MemberVO member) {

		log .info("signIn.............." + member);
		
		mapper.insertSelectKey(member);
	}

	@Override
	public MemberVO info(int mno) {
		
		log.info("info................." + mno);
		
		return mapper.read(mno);
	}

	@Override
	public boolean modify(MemberVO member) {

		log.info("modify.................." + member);
		
		return mapper.update(member)== 1;
	}

	@Override
	public boolean remove(int mno) {
		
		log.info("remove....................." + mno);
		
		return mapper.delete(mno) == 1;
	}

}

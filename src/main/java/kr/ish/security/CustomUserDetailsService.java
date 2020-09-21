package kr.ish.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.ish.domain.CustomUser;
import kr.ish.domain.MemberVO;
import kr.ish.mapper.MembersMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService{
	
	@Setter(onMethod_ = {@Autowired})
	private MembersMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws
	UsernameNotFoundException {
		
		log.warn("Load User By UserName : " + userName);
		
		MemberVO vo = memberMapper.read(userName);
		
		log.warn("queried by member mapper: " + vo);
		
		return vo == null ? null :new CustomUser(vo);
	}
}

package kr.ish.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ish.domain.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private MemberService service;
	
//	@Test
//	public void test() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
	@Test
	public void testSignIn() {
		
		MemberVO member = new MemberVO();
		member.setMember_id("userService1");			//유니크 키: 중복되지 않도록 매번 바꿀것
		member.setMember_pass("passpass");
		member.setName("userService");
		
		service.signIn(member);
		
		log.info("new member's mno....................:" + member.getMno());
	}

}

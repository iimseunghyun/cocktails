package kr.ish.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ish.domain.AuthorityVO;
import kr.ish.domain.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MembersMapperTests {

	@Setter (onMethod_ = {@Autowired})
	private MembersMapper mapper;
	
	@Setter (onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;
	
	@Setter (onMethod_ = {@Autowired})
	private AuthoritiesMapper authMapper;
	
	
	
//	@Test
//	public void test() {
//		MemberVO member = mapper.read1(1);
//		
//		log.info(member);
//	}

//	@Test
//	public void testInsert() {
//		
//		for (int i = 0; i<100; i++) {
//
//		if(i < 80) {
//			
//			String passString = pwencoder.encode("pass"+i);
//			
//			MemberVO member = new MemberVO();
//			member.setId("user" + i);
//			member.setPass(passString);
//			member.setName("일반사용자" + i);
//			
//	 		mapper.insert(member);
//			
//			log.info(member);
//		
//		}else if (i < 90) {
//			
//			String passString = pwencoder.encode("pass"+i);
//			
//			MemberVO member = new MemberVO();
//			member.setId("manager" + i);
//			member.setPass(passString);
//			member.setName("운영자" + i);
//			
//			mapper.insert(member);
//			
//			log.info(member);
//			
//		}else {
//			String passString = pwencoder.encode("pass"+i);
//			
//			MemberVO member = new MemberVO();
//			member.setId("admin" + i);
//			member.setPass(passString);
//			member.setName("관리자" + i);
//			
//			mapper.insert(member);
//			
//			log.info(member);
//			
//		}
//		
//		}
//	}
	
//	@Test
//	public void testInsertAuth() {
//		
//		for (int i = 0; i<100; i++) {
//
//		if(i < 80) {
//						
//			AuthorityVO auth = new AuthorityVO();
//			auth.setId("user" + i);
//			auth.setAuthority("ROLE_USER");
//			
//	 		authMapper.insertAuth(auth);
//			
//			log.info(auth);
//		
//		}else if (i < 90) {
//			
//			
//			AuthorityVO auth = new AuthorityVO();
//			auth.setId("manager" + i);
//			auth.setAuthority("ROLE_MEMBER");
//			
//	 		authMapper.insertAuth(auth);
//			
//			log.info(auth);
//			
//		}else {
//			
//			AuthorityVO auth = new AuthorityVO();
//			auth.setId("admin" + i);
//			auth.setAuthority("ROLE_ADMIN");
//			
//	 		authMapper.insertAuth(auth);
//			
//			log.info(auth);
//			
//		}
//		
//		}
//	}

//	@Test
//	public void testInsertAuth2() {
//		
//		for (int i = 80; i<100; i++) {
//			
//			if(i < 90) {
//							
//				AuthorityVO auth = new AuthorityVO();
//				auth.setId("manager" + i);
//				auth.setAuthority("ROLE_USER");
//				
//		 		authMapper.insertAuth(auth);
//				
//				log.info(auth);
//			
//			}else if (i < 100) {
//								
//				AuthorityVO auth = new AuthorityVO();
//				auth.setId("admin" + i);
//				auth.setAuthority("ROLE_USER");
//				
//		 		authMapper.insertAuth(auth);
//		 		
//		 		AuthorityVO auth2 = new AuthorityVO();
//		 		auth2.setId("admin" +i);
//		 		auth2.setAuthority("ROLE_MEMBER");
//		 		
//		 		authMapper.insertAuth(auth2);
//				
//				log.info(auth);
//				
//			}
//	}
//}
	
//	@Test
//	public void testInsertData() {
//		
//		String passString = pwencoder.encode("pass100");
//		
//		MemberVO member = new MemberVO();
//		member.setId("admin100");
//		member.setPass(passString);
//		member.setName("관리자100");
//		
// 		mapper.insert(member);
//		
//		log.info(member);
//		
//		AuthorityVO auth = new AuthorityVO();
//		auth.setId("admin100");
//		auth.setAuthority("ROLE_ADMIN");
//		
// 		authMapper.insertAuth(auth);
//		
//		log.info(auth);
//	}
	
	
	
	@Test
	public void testRead() {
		
		MemberVO vo = mapper.read("admin99");
		
		log.info("....................." + vo);
		
		vo.getAuthList().forEach(authVO -> log.info("-------------"+authVO));
	}
		
}

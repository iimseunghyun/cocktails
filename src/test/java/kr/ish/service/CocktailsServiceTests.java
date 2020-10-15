package kr.ish.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ish.domain.CocktailsVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CocktailsServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private CocktailsService service;
	
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void testRegister() {
//		
//		CocktailsVO cock = new CocktailsVO();
//		cock.setCname("register service test");
//		cock.setCinfo("register service test");
//		
//		service.register(cock);
//		
//		log.info("new cno : .........." + cock.getCno());
//	}

//	@Test
//	public void testGetCList() {
//	
//		service.getCList().forEach(cock -> log.info(cock));
//	}
	
//	@Test
//	public void tetGetC() {
//		
//		log.info(service.getC(1));
//		
//	}
	
//	@Test
//	public void testDelete() {
//		
//		log.info("remove result: " + service.remove(1));
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		CocktailsVO cock = service.getC(2);
//		
//		if (cock == null) {
//			return;
//		}
//		
//		cock.setCname("modify service test");
//		log.info("modify result: " + service.modify(cock));
//	}
	
}

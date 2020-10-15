package kr.ish.mapper;

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

public class CocktailsMapperTests {

	@Setter(onMethod_ = @Autowired)
	private CocktailsMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(cock -> log.info(cock));
//	}
	
//	@Test
//	public void testInsert() {
//		
//		CocktailsVO cock = new CocktailsVO();
//		cock.setCinfo("testInsertDum");
//		cock.setCname("TestInsertDum");
//		
//		mapper.insert(cock);
//		
//		log.info(cock);
//	}

	@Test
	public void testInsertSelectKey() {
		
		CocktailsVO cock = new CocktailsVO();
		cock.setCname("testInsertSelectKey");
		cock.setCinfo("testInsertSelectKey");
		
		log.info(cock);
		
		mapper.insertSelectKey(cock);
		
		log.info(cock);
	}

//	@Test
//	public void testRead() {
//		
//		CocktailsVO cock = mapper.read(5);
//		
//		log.info(cock);
//	}
	
//	@Test
//	public void testDelete() {
//			
//		log.info("Delete Count: " + mapper.delete(7));
//		
//	}
	
//	@Test
//	public void testUpdate() {
//		
//		CocktailsVO cock = new CocktailsVO();
//		
//		cock.setCno(1);
//		cock.setCname("updateTest");
//		cock.setCinfo("updateTest");
//		
//		log.info("update count: " + mapper.update(cock));
//	} 
	
	
}

package kr.ish.mapper;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

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
public class MemberMapperTests {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
//	@Test
//	public void insert_test() {
//		
//		IntStream.rangeClosed(5, 9).forEach(i ->{
//			
//		MemberVO vo = new MemberVO();
//		vo.setMember_id("user"+ i);
//		vo.setMember_pass("pass"+ i);
//		vo.setName("nick"+ i);
//		
//		mapper.insert(vo);
//		
//		log.info(vo);
//		});
//	}
	@Test
	public void testRead() {
		
		MemberVO vo = mapper.read(2);
		
		log.info(vo);
	}
	
//	@Test
//	public void testUpdate() {
//		
//		MemberVO vo = new MemberVO();
//		vo.setMno(1);
//		vo.setMember_pass("update");
//		vo.setName("update");
//		
//		int count = mapper.update(vo);
//		log.info(".................update count: " + count);
//	}
	
//	@Test
//	public void testDelete() {
//		
//		log.info("..............delete count: " + mapper.delete(5));
//	}

}

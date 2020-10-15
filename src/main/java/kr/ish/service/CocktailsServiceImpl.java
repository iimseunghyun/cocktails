package kr.ish.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ish.domain.CocktailsVO;
import kr.ish.mapper.CocktailsMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class CocktailsServiceImpl implements CocktailsService {

	private CocktailsMapper mapper;
	
	@Override
	public void register(CocktailsVO cock) {
		
		log.info("register new cocktail :........ " + cock);
		
		mapper.insertSelectKey(cock);
	}

	@Override
	public CocktailsVO getC(int cno) {
		
		log.info("get : ........." + cno);
		
		return mapper.read(cno);
	}

	@Override
	public boolean modify(CocktailsVO cock) {
		
		log.info("modify : ............" + cock);
		
		return mapper.update(cock) == 1;
	}

	@Override
	public boolean remove(int cno) {
		
		log.info("remove : .............." + cno);
		
		return mapper.delete(cno) == 1;
	}

	@Override
	public List<CocktailsVO> getCList() {
		
		log.info("getList..........");
		return mapper.getList();
	}

}

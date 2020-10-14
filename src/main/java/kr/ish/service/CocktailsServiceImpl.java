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

	}

	@Override
	public CocktailsVO get(int cno) {
		return null;
	}

	@Override
	public boolean modify(CocktailsVO cock) {
		return false;
	}

	@Override
	public boolean remove(int cno) {
		return false;
	}

	@Override
	public List<CocktailsVO> getList() {
		return null;
	}

}

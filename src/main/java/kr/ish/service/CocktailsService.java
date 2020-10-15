package kr.ish.service;

import java.util.List;

import kr.ish.domain.CocktailsVO;

public interface CocktailsService {

	public void register(CocktailsVO cock);
	
	public CocktailsVO getC(int cno);
	
	public boolean modify(CocktailsVO cock);
	
	public boolean remove(int cno);
	
	public List<CocktailsVO> getCList();
}

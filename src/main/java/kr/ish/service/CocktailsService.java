package kr.ish.service;

import java.util.List;

import kr.ish.domain.CocktailsVO;

public interface CocktailsService {

	public void registerC(CocktailsVO cock);
	
	public CocktailsVO getC(int cno);
	
	public boolean modifyC(CocktailsVO cock);
	
	public boolean removeC(int cno);
	
	public List<CocktailsVO> getCList();
}

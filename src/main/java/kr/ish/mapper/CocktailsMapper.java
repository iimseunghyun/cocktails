package kr.ish.mapper;

import java.util.List;

import kr.ish.domain.CocktailsVO;

public interface CocktailsMapper {
	
	public List<CocktailsVO> getList();
	
	public void insert(CocktailsVO cock);
	
	public void insertSelectKey(CocktailsVO cock);
	
	public CocktailsVO read(int cno);
	
	public int delete (int cno);
	
	public int update (CocktailsVO cock);
}

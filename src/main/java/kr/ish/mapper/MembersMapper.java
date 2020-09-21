package kr.ish.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.ish.domain.AuthorityVO;
import kr.ish.domain.MemberVO;

public interface MembersMapper {

//	@Select("select * from cocktails_db.members where mno = #{mno}")
//	public MemberVO read1 (int mno);
//	
//	@Insert("insert into cocktails_db.members(id, pass, name) values(#{id},#{pass},#{name})")
//	public void insert (MemberVO member);
	
	public MemberVO read(String id);

}

package kr.ish.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.ish.domain.AuthorityVO;

public interface AuthoritiesMapper {

	@Insert("insert into cocktails_db.authorities(id, authority) values(#{id},#{authority})")
	public void insertAuth (AuthorityVO auth);
}

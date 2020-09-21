package kr.ish.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {
	
	private int mno;
	private String id;
	private String pass;
	private String name;
	private boolean enabled;
	
	private Date regDate;
	private Date updateDate;
	private List<AuthorityVO> authList;
}

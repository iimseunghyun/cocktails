package kr.ish.domain;

import lombok.Data;

@Data
public class MemberVO {
	
	private int mno;
	private String member_id;
	private String member_pass;
	private String name;
	private boolean isAdmin;
}

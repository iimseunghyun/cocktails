package kr.ish.security;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j
public class MemberTests {

	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;
	
	@Setter(onMethod_ = @Autowired)
	private DataSource ds;
	
	@Test
	public void testInsertMember() {

		String sql = "insert into cocktails_db.members(id, pass, name) values(?,?,?)";
		
//		for(int i = 0; i<100; i++) {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try {
//				con = ds.getConnection();
//				pstmt = con.prepareStatement(sql);
//				
//				pstmt.setString(2, pwencoder.encode("pw" + i));
//				
//				if(i <80) {
//					
//					pstmt.setString(1, "user" + i);
//					pstmt.setString(3, "username" + i );
//					
//				}else if (i < 90) {
//					
//					pstmt.setString(1, "manager" +i);
//					pstmt.setString(3, "managername" +i);
//				}else {
//					
//					pstmt.setString(1, "admin" + i);
//					pstmt.setString(3, "adminname" + i);
//				}
				
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, "userid");
				pstmt.setString(2, pwencoder.encode("pass"));
				pstmt.setString(3, "username");
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
				if(pstmt != null) {try {pstmt.close(); }catch (Exception e ) {}}
				if(con != null) {try {con.close(); }catch (Exception e ) {}}
				
			}
//		}//end for
	}

}

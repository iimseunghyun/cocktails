package kr.ish.persistence;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBC {

	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		try (Connection con =
				DriverManager.getConnection(
						"jdbc:mariadb://localhost:3306/cocktails_db",
						"ish",
						"ishish")){
			log.info(con);			
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}

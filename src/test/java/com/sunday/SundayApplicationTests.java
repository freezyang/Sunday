package com.sunday;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SundayApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Autowired
	private DataSource dataSource;

	@Test
	public void testConn() {
		System.out.println(dataSource);
		try {
			Connection con = dataSource.getConnection();
			System.out.println(con);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

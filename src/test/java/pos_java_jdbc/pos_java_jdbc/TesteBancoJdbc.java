package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();  
		
		userposjava.setId(5L);
		userposjava.setNome("edson da costa");
		userposjava.setEmail("edson@hotmail.com ");
		
		userPosDAO.salvar(userposjava);
	}
}

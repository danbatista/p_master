package com.danbatista.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.danbatista.DAO.usuarioDAO;
import com.danbatista.VO.contasVO;
import com.danbatista.VO.usuarioVO;



public class usuarioDAOImpl extends JdbcTemplate implements usuarioDAO {
	
	
	JdbcTemplate template;
	
	public usuarioDAOImpl() {
		
	}
	
   private final String LISTALL = "Select * from usuario";	
 
   
	public usuarioDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
		
	}

	
	public boolean InserirConta(usuarioVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean AlterarConta(usuarioVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean DeletarConta(int cod) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<usuarioVO> listaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<contasVO> listById(int cod) throws Exception {
		
		String listById = "SELECT * FROM conta WHERE iduser="+cod;
		
		
		List<contasVO> list = null;
	//	Object[] args = new Object[] {cod};
		contaMapper mapper = new contaMapper();
		try {
		 list = query(listById, mapper);
		 System.out.println("Deu bom? " +list.size());
		return list;
		}catch(Exception e) {
			System.out.println("Não voltou nada!"+e);
			return null;
		}
	}
	
	public usuarioVO listByLogin(String email, String senha) {
		// TODO Auto-generated method stub
		
		String listByLogin = "Select * from usuario WHERE email=?";
		usuarioVO usermail = null;
		
		Object[] params = new Object[] {email};
		usuarioMapper mapper = new usuarioMapper();
		try {
	     usermail = queryForObject(listByLogin,params,mapper);
	     return usermail;
		}catch(Exception e) {
			return null;
		}
	}

}

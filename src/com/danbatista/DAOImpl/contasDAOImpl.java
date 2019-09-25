package com.danbatista.DAOImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.danbatista.DAO.IcontasDAO;
import com.danbatista.VO.contasVO;

public class contasDAOImpl  extends JdbcTemplate implements IcontasDAO {
	
	JdbcTemplate template;
	
	public contasDAOImpl() {
		
	}
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	private final String Insere = "INSERT INTO conta(nomeconta, contapai, ptes, ptdir, acalcular, "
			+ "binario, inddireta, opcao, total,tipoconta,ladoconta)" + 
			"VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	
	private final String LISTALL = "SELECT * FROM conta";
	
	 public contasDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
		// TODO Auto-generated constructor stub
	}

	
	public boolean InserirConta(contasVO conta) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean AlterarConta(contasVO conta) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean DeletarConta(int cod) {
		// TODO Auto-generated method stub
		return false;
	}


	public List<contasVO> listaTodos() {

		List<contasVO> lista = null; 
		
		try {
			lista = query(LISTALL, new BeanPropertyRowMapper<contasVO>(contasVO.class));
			return lista;
		} catch (Exception e) {
			System.out.println("" + e.getCause());
			return lista;
		}

           
	}

	
	public contasVO listById(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

}

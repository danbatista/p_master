package com.danbatista.DAOImpl;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.danbatista.VO.usuarioVO;

public class usuarioMapper implements RowMapper<usuarioVO> {

	@Override
	public usuarioVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	        String nome = rs.getString("nome");
	        String email = rs.getString("email"); 
	        String senha = rs.getString("senha");
	        String graduacao = rs.getString("graduacao");
	        Integer id = rs.getInt("id");
	        return new usuarioVO(nome, email,  senha,  graduacao,  id);
	}
	
	

}

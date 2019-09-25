package com.danbatista.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.danbatista.VO.*;

public class contaMapper implements RowMapper<contasVO> {

	@Override
	public contasVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Integer id = rs.getInt("id");
		String  nomeConta=rs.getString("nomeconta");
		String  contapai =rs.getString("contapai");
		Integer ptes     =rs.getInt("ptes");
		Integer ptdir    =rs.getInt("ptdir");
		Integer acalcular=rs.getInt("acalcular");
		Integer opcao    =rs.getInt("opcao");
		Integer tipoconta=rs.getInt("tipoconta");
		Integer ladoconta=rs.getInt("ladoconta");
		Integer total    =rs.getInt("total");
		Integer binario  =rs.getInt("binario");
		Integer indicacaoDireta=rs.getInt("inddireta");
		
		
		return new contasVO(id,nomeConta,
				contapai ,
				ptes   , 
				ptdir  ,  
				acalcular,
				opcao    ,
				tipoconta,
				ladoconta,
				total    ,
				binario  ,
				indicacaoDireta);
	}

}

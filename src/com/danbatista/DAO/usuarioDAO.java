package com.danbatista.DAO;

import java.util.List;

import com.danbatista.VO.usuarioVO;

import com.danbatista.VO.contasVO;

public interface usuarioDAO {
	
	
 public  boolean InserirConta(usuarioVO user);
	 
	 public  boolean AlterarConta(usuarioVO user);
	 
	 public  boolean DeletarConta(int cod);
	 
	 public  List<usuarioVO> listaTodos();
	    
	 public  List<contasVO>  listById(int cod) throws Exception;
	 
	 public usuarioVO listByLogin(String email, String senha);

}

package com.danbatista.DAO;

import java.util.List;

import com.danbatista.VO.contasVO;

public interface IcontasDAO {
	
	
	 public  boolean InserirConta(contasVO conta);
	 
	 public  boolean AlterarConta(contasVO conta);
	 
	 public  boolean DeletarConta(int cod);
	 
	 public  List<contasVO> listaTodos();
	    
	 public  contasVO listById(int cod);

}

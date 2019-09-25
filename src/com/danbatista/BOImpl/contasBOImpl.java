package com.danbatista.BOImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;



import com.danbatista.BO.contasBO;
import com.danbatista.DAO.IcontasDAO;
import com.danbatista.VO.contasVO;

public class contasBOImpl implements contasBO {
	
    @Autowired
	private IcontasDAO dao;
    
    public contasBOImpl() {
    	
    }

	
	public boolean InserirConta(contasVO conta) {
		// TODO Auto-generated method stub
		return dao.InserirConta(conta);
	}

	
	public boolean AlterarConta(contasVO conta) {
		// TODO Auto-generated method stub
		return dao.AlterarConta(conta);
	}

	
	public boolean DeletarConta(int cod) {
		// TODO Auto-generated method stub
		return dao.DeletarConta(cod);
	}

	
	public List<contasVO> listaTodos() {
		// TODO Auto-generated method stub
		return dao.listaTodos();
	}

	
	public contasVO listById(int cod) {
		// TODO Auto-generated method stub
		return dao.listById(cod);
	}
	


}

package com.danbatista.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.danbatista.DAO.usuarioDAO;
import com.danbatista.VO.contasVO;
import com.danbatista.VO.usuarioVO;

@Controller
public class usuarioController {
	
	@Autowired
	private usuarioDAO DAO;
	
	public  usuarioController() {
		
	}
	
	@RequestMapping(value = "/login")
	public String pagelogin(ModelMap model) {
		usuarioVO user = new usuarioVO();
		model.addAttribute("usuario",user);
		//return new ModelAndView("login","user",null);
		return "login";
	}
	
	@RequestMapping(value ="/getlogin", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuario") usuarioVO user, BindingResult b,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		usuarioVO findUser = new usuarioVO();
		findUser = DAO.listByLogin(user.getEmail(), user.getSenha());
		
		List<contasVO> list = DAO.listById(findUser.getId());
		
		if(findUser.getSenha().equalsIgnoreCase(user.getSenha())) {
			request.getSession().setAttribute("usuario", findUser);
			System.out.println("Email:" + user.getEmail() + " Senha:" + user.getSenha());
			return new ModelAndView("inicio","list",list);
		}else {
			return new ModelAndView("login-error","","");
		}
		
	
		
		
	}
	

}

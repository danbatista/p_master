package com.danbatista.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.danbatista.DAO.IcontasDAO;
import com.danbatista.VO.contasVO;


@Controller
public class contasController {
	
	@Autowired
	private IcontasDAO dao;
	
	public contasController() {
		
	}
	
	
	
	@RequestMapping(value = "hello")
	public ModelAndView hello() {
		System.out.println("Hello World!");
		return null;
	}
	
	

}

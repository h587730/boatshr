package com.example.demo.controller;

import com.example.demo.dao.BPRepo;
import com.example.demo.dao.SelskapRepo;
import com.example.demo.model.Baatparkering;
import com.example.demo.model.Selskap;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaatController {

    @Autowired
    SelskapRepo selskapRepo;

    @Autowired
    BPRepo bpRepo;


    @RequestMapping("/")
    public String home(){

        return "home.jsp";
    }
    
    
    @RequestMapping("/registrerBP")
	public String regBP(Baatparkering bp) {
		
		bpRepo.save(bp);
		
		return "vellykketReg.jsp";
	}

    
    @RequestMapping("/registrerSelskap")
	public String regSelskap(Selskap selskap) {
		
		selskapRepo.save(selskap);
		
		return "vellykketReg.jsp";
	}



}










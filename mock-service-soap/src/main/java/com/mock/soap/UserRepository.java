package com.mock.soap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

	 private static final Map<String, List<String>> users = new HashMap<>();
	 
	    @PostConstruct
	    public void initData() {
	    	
	    	List<String> responseList1 = new ArrayList<>();
	    	responseList1.add("001");
	    	responseList1.add("Login realizado com sucesso");
	    	responseList1.add("VENDAS");
	    	users.put("VENDAS", responseList1);
	    	
	    	List<String> responseList2 = new ArrayList<>();
	    	responseList2.add("001");
	    	responseList2.add("Login realizado com sucesso");
	    	responseList2.add("DIRF");
	    	users.put("DIRF", responseList2);
	    	
	    	List<String> responseList3 = new ArrayList<>();
	    	responseList3.add("001");
	    	responseList3.add("Login realizado com sucesso");
	    	responseList3.add("CONFAZ");
	    	users.put("CONFAZ", responseList3);	    	

	    	List<String> responseList4 = new ArrayList<>();
	    	responseList4.add("001");
	    	responseList4.add("Login realizado com sucesso");
	    	responseList4.add("PAGTO");
	    	users.put("PAGTO", responseList4);	    	    	
	    	
	    	List<String> responseList5 = new ArrayList<>();
	    	responseList5.add("003");
	    	responseList5.add("Senha inválida");
	    	users.put("FAIL", responseList5);
	    	
	    	List<String> responseList6 = new ArrayList<>();
	    	responseList6.add("001");
	    	responseList6.add("Login realizado com sucesso");
	    	responseList6.add("VENDAS");
	    	users.put("VENDAS1", responseList6);
	    	
	    	List<String> responseList7 = new ArrayList<>();
	    	responseList7.add("001");
	    	responseList7.add("Login realizado com sucesso");
	    	responseList7.add("VENDAS");
	    	users.put("VENDAS2", responseList7);
	    	
	    	List<String> responseList8 = new ArrayList<>();
	    	responseList8.add("001");
	    	responseList8.add("Login realizado com sucesso");
	    	responseList8.add("VENDAS");
	    	users.put("VENDAS3", responseList8);
 
	    }
	 
	    public List<String> findUser(String name) {
	        return users.get(name);
	    }
	
}

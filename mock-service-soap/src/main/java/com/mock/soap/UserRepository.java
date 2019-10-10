package com.mock.soap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.ArrayOfJavaLangstringLiteral;
import io.spring.guides.gs_producing_web_service.LoginNovoFrontResponse;

@Component
public class UserRepository {

	 private static final Map<String, LoginNovoFrontResponse> users = new HashMap<>();
	 
	    @PostConstruct
	    public void initData() {
	    	
	    	LoginNovoFrontResponse response1 = new LoginNovoFrontResponse();
	    	
	    	// USUARIO 1 - inicio
	    	ArrayOfJavaLangstringLiteral arrayOfJava1 = new ArrayOfJavaLangstringLiteral();
	    	List<String> array1 = new ArrayList<>();
	    	//PERFIS
	    	array1.add("VENDAS");
	    	array1.add("DIRF");
	    	array1.add("CONFAZ");
	    	arrayOfJava1.setJavaLangstring(array1);
	    	//
	    	response1.setCodigoRetorno("1");
	    	response1.setDescricaoRetorno("Login realizado com sucesso");
	    	response1.setLocalizador("");
	    	response1.setAgrupador("");
	    	response1.setPerfil(arrayOfJava1);
	    	response1.setEmpresa("Empresa");
	    	response1.setSistema("MAS-WEB");
	    	response1.setAvisoSenha("");
	    	response1.setNome("Nome Teste");
	    	response1.setCpf("123456789");
	    	
	    	users.put("VENDAS", response1);
	    	// USUARIO 1 - fim
	    	
 
	    }
	 
	    public LoginNovoFrontResponse findUser(String name) {
	        return users.get(name);
	    }
	
}

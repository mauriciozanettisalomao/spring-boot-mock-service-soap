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
	    	LoginNovoFrontResponse response2 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response3 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response4 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response5 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response6 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response7 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response8 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response9 = new LoginNovoFrontResponse();
	    	LoginNovoFrontResponse response10 = new LoginNovoFrontResponse();
	    	
            // USUARIO 1 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava1 = new ArrayOfJavaLangstringLiteral();
            List<String> array1 = new ArrayList<>();
            //PERFIS
            array1.add("RECVENDAS");
            array1.add("DIRF");
            array1.add("CONFAZ");
            array1.add("RECPAGTO");
            arrayOfJava1.setPerfil(array1);
            //
            response1.setCodigoRetorno("1");
            response1.setDescricaoRetorno("Login realizado com sucesso");
            response1.setLocalizador("");
            response1.setAgrupador("");
            response1.setGPerfil(arrayOfJava1);
            response1.setEmpresa("Empresa");
            response1.setSistema("MAS-WEB");
            response1.setAvisoSenha("");
            response1.setNome("Nome Teste");
            response1.setCpf("123456789");
            
            users.put("USER1", response1);
            // USUARIO 1 - fim
            
            // USUARIO 2 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava2 = new ArrayOfJavaLangstringLiteral();
            List<String> array2 = new ArrayList<>();
            //PERFIS
            array2.add("RECVENDAS");
            arrayOfJava2.setPerfil(array2);
            //
            response2.setCodigoRetorno("1");
            response2.setDescricaoRetorno("Login realizado com sucesso");
            response2.setLocalizador("Localizador");
            response2.setAgrupador("");
            response2.setGPerfil(arrayOfJava2);
            response2.setEmpresa("Empresa");
            response2.setSistema("MAS-WEB");
            response2.setAvisoSenha("");
            response2.setNome("Nome Teste2");
            response2.setCpf("123456789");
            
            users.put("USER2", response2);
            // USUARIO 2 - fim

            // USUARIO 3 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava3 = new ArrayOfJavaLangstringLiteral();
            List<String> array3 = new ArrayList<>();
            //PERFIS
            array3.add("DIRF");
            arrayOfJava3.setPerfil(array3);
            //
            response3.setCodigoRetorno("1");
            response3.setDescricaoRetorno("Login realizado com sucesso");
            response3.setLocalizador("Localizador");
            response3.setAgrupador("Agrupador");
            response3.setGPerfil(arrayOfJava3);
            response3.setEmpresa("Empresa");
            response3.setSistema("MAS-WEB");
            response3.setAvisoSenha("");
            response3.setNome("Nome Teste3");
            response3.setCpf("123456789");
            
            users.put("USER3", response3);
            // USUARIO 3 - fim

            // USUARIO 4 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava4 = new ArrayOfJavaLangstringLiteral();
            List<String> array4 = new ArrayList<>();
            //PERFIS
            array4.add("CONFAZ");
            arrayOfJava4.setPerfil(array4);
            //
            response4.setCodigoRetorno("1");
            response4.setDescricaoRetorno("Login realizado com sucesso");
            response4.setLocalizador("Localizador");
            response4.setAgrupador("Agrupador");
            response4.setGPerfil(arrayOfJava4);
            response4.setEmpresa("Empresa");
            response4.setSistema("MAS-WEB");
            response4.setAvisoSenha("");
            response4.setNome("Nome Teste4");
            response4.setCpf("124456789");
            
            users.put("USER4", response4);
            // USUARIO 4 - fim

            // USUARIO 5 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava5 = new ArrayOfJavaLangstringLiteral();
            List<String> array5 = new ArrayList<>();
            //PERFIS
            array5.add("RECPAGTO");
            arrayOfJava5.setPerfil(array5);
            //
            response5.setCodigoRetorno("1");
            response5.setDescricaoRetorno("Login realizado com sucesso");
            response5.setLocalizador("Localizador");
            response5.setAgrupador("Agrupador");
            response5.setGPerfil(arrayOfJava5);
            response5.setEmpresa("Empresa");
            response5.setSistema("MAS-WEB");
            response5.setAvisoSenha("");
            response5.setNome("Nome Teste5");
            response5.setCpf("125556789");
            
            users.put("USER5", response5);
            // USUARIO 5 - fim

            // USUARIO 6 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava6 = new ArrayOfJavaLangstringLiteral();
            List<String> array6 = new ArrayList<>();
            //PERFIS
            array6.add("RECVENDAS");
                  array6.add("RECPAGTO");
            arrayOfJava6.setPerfil(array6);
            //
            response6.setCodigoRetorno("1");
            response6.setDescricaoRetorno("Login realizado com sucesso");
            response6.setLocalizador("Localizador");
            response6.setAgrupador("Agrupador");
            response6.setGPerfil(arrayOfJava6);
            response6.setEmpresa("Empresa");
            response6.setSistema("MAS-WEB");
            response6.setAvisoSenha("");
            response6.setNome("Nome Teste6");
            response6.setCpf("126666789");
            
            users.put("USER6", response6);
            // USUARIO 6 - fim

            // USUARIO 7 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava7 = new ArrayOfJavaLangstringLiteral();
            List<String> array7 = new ArrayList<>();
            //PERFIS
            array7.add("DIRF");
                  array7.add("CONFAZ");
            arrayOfJava7.setPerfil(array7);
            //
            response7.setCodigoRetorno("1");
            response7.setDescricaoRetorno("Login realizado com sucesso");
            response7.setLocalizador("Localizador");
            response7.setAgrupador("Agrupador");
            response7.setGPerfil(arrayOfJava7);
            response7.setEmpresa("Empresa");
            response7.setSistema("MAS-WEB");
            response7.setAvisoSenha("");
            response7.setNome("Nome Teste7");
            response7.setCpf("127777789");
            
            users.put("USER7", response7);
            // USUARIO 7 - fim

            // USUARIO 8 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava8 = new ArrayOfJavaLangstringLiteral();
            List<String> array8 = new ArrayList<>();
            //PERFIS
            array8.add("");
            arrayOfJava8.setPerfil(array8);
            //
            response8.setCodigoRetorno("2");
            response8.setDescricaoRetorno("Login ou Senha Invalida");
            response8.setLocalizador("");
            response8.setAgrupador("");
            response8.setGPerfil(arrayOfJava8);
            response8.setEmpresa("");
            response8.setSistema("");
            response8.setAvisoSenha("");
            response8.setNome("");
            response8.setCpf("");
            
            users.put("USER8", response8);
            // USUARIO 8 - fim

            // USUARIO 9 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava9 = new ArrayOfJavaLangstringLiteral();
            List<String> array9 = new ArrayList<>();
            //PERFIS
            array9.add("");
            arrayOfJava9.setPerfil(array9);
            //
            response9.setCodigoRetorno("3");
            response9.setDescricaoRetorno("Usuário Bloqueado");
            response9.setLocalizador("");
            response9.setAgrupador("");
            response9.setGPerfil(arrayOfJava9);
            response9.setEmpresa("");
            response9.setSistema("");
            response9.setAvisoSenha("");
            response9.setNome("");
            response9.setCpf("");
            
            users.put("USER9", response9);
            // USUARIO 9 - fim

            // USUARIO 10 - inicio
            ArrayOfJavaLangstringLiteral arrayOfJava10 = new ArrayOfJavaLangstringLiteral();
            List<String> array10 = new ArrayList<>();
            //PERFIS
            array10.add("");
            arrayOfJava10.setPerfil(array10);
            //
            response10.setCodigoRetorno("1");
            response10.setDescricaoRetorno("Login realizado com sucesso");
            response10.setLocalizador("Localizador");
            response10.setAgrupador("Agrupador");
            response10.setGPerfil(arrayOfJava10);
            response10.setEmpresa("Empresa");
            response10.setSistema("MAS-WEB");
            response10.setAvisoSenha("");
            response10.setNome("Nome Teste10");
            response10.setCpf("1210456789");
            users.put("USER10", response10);
            // USUARIO 10 - fim
 
	    }
	 
	    public LoginNovoFrontResponse findUser(String name) {
	        return users.get(name);
	    }
	
}

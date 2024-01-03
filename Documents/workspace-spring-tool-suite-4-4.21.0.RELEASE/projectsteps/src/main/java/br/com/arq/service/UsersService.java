package br.com.arq.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.UUID;

import br.com.arq.entity.Users;

public class UsersService {
	
	
	public String gerarSenha(String senha) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			String chave = "chaveprofedsonbelem@gmail.com;www.gmail.com;1+1=0";

			md.update((senha + chave).getBytes()); // bytes
			BigInteger hash = new BigInteger(1, md.digest()); // Integer
			String resposta1 = hash.toString(16); // String

			md.update(("123456" + chave).getBytes()); // bytes
			BigInteger hash2 = new BigInteger(1, md.digest());  
			String resposta2 = hash2.toString(16);  
			String senha1 = resposta1;
			String senha2 = resposta2;
		  return senha1 + senha2;
		} catch (Exception ex) {
			throw new IllegalArgumentException("Senha Invalida !!!");
		}
	}
	
	public String gerarToken(Users users) throws Exception {
        try {
            String uuid = UUID.randomUUID().toString();
            Date data= new Date();
            MessageDigest md = MessageDigest.getInstance("MD5");
            String chave = "chaveprofedsonbelem@gmail.com;www.gmail.com;1+1=0";
            	md.update((users.getEmail() + chave).getBytes());  
                BigInteger hash = new BigInteger(1, md.digest());  
    			String resposta1 = hash.toString(16); 
    			users.setToken(resposta1 + uuid + "#"+ data.getTime());
    			return users.getToken();
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Senha Invalida!!!");
        }
}

}

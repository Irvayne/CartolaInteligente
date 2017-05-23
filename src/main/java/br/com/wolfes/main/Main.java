package br.com.wolfes.main;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.wolfes.model.Atleta;
import br.com.wolfes.model.InformacoesJogadores;

public class Main {

	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			
			DefaultHttpClient client = new DefaultHttpClient();
	        HttpPost post = new HttpPost("https://api.cartolafc.globo.com/atletas/mercado");
	        HttpResponse response = client.execute(post);
	        if(response.getStatusLine().getStatusCode() == 200){
	        	String json_string = EntityUtils.toString(response.getEntity());
	        	
	        	InformacoesJogadores player= gson.fromJson(json_string, InformacoesJogadores.class);
	        	for(Atleta aux: player.getAtletas()){
	        		if(aux.getJogos_num() > 0)
	        			System.out.println(""+aux.getApelido());
	        	}
	        	
	        }
			

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

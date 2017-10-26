package br.net.softwave.client.controller;

import br.net.softwave.client.domain.AreaConhecimento;
import br.net.softwave.client.util.URLController;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

public class AreasConhecimentoController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ClientConfig clientConfig = new DefaultClientConfig(JacksonJsonProvider.class);
        com.sun.jersey.api.client.Client cliente = com.sun.jersey.api.client.Client.create(clientConfig);
        URLController urlc = new URLController(br.net.softwave.client.Client.ENDERECO_AREACONHECIMENTO);
        WebResource webResource = cliente.resource(urlc.pegarTodos());
        ClientResponse resposta = webResource
                .type(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
        
        if (resposta.getStatus() == ClientResponse.Status.OK.getStatusCode()) {
            AreaConhecimento[] areasConhecimento = resposta.getEntity(AreaConhecimento[].class);
            
        } else {
            System.out.println("Não foi possível carregar as áreas do conhecimento");
        }
        
        resposta.close();
    }
    
}

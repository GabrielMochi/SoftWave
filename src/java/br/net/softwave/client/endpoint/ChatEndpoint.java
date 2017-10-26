package br.net.softwave.client.endpoint;

import java.io.IOException;
import java.net.URI;
import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

@ClientEndpoint
public class ChatEndpoint {
    
    private Session session;
    private MensagemHandler mensagemHandler;
    
    public ChatEndpoint(final URI endpointURI) throws IOException, DeploymentException {
        this.session = null;
        
        try {
            conectar(endpointURI);
        } catch (IOException | DeploymentException ex) {
            throw ex;
        }
    }
    
    @OnOpen
    public void onOpen(final Session session) {
        this.session = session;
    }
    
    /*@OnMessage
    public*/
    
    @OnClose
    public void onClose(final Session session, final CloseReason reason) {
        this.session = null;
    }
    
    public final void conectar(final URI endpointURI) throws DeploymentException, IOException {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(this, endpointURI);
    }
    
    public static interface MensagemHandler {
        public void handleMessage(String message);
    }
    
}

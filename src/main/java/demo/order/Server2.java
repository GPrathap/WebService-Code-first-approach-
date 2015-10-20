package demo.order;

/**
 * Created by geesara on 10/20/15.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Server2 {
    private static Log log = LogFactory.getLog(Server2.class);
    @WebMethod
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args ){
        log.info("Starting server...");
        Endpoint.publish("http://10.100.7.114:1234/Server2", new Server2());
    }
}

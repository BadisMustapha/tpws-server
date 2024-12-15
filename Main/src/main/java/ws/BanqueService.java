package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueService")
public class BanqueService {

    @WebMethod(operationName = "conversionEuroToMad")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,100*Math.random()*9000,new Date());
    }

    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,100*Math.random()*9000,new Date()),
                new Compte(2,100*Math.random()*9000,new Date()),
                new Compte(3,100*Math.random()*9000,new Date()),
                new Compte(4,100*Math.random()*9000,new Date()),
                new Compte(5,100*Math.random()*9000,new Date()));
    }


}

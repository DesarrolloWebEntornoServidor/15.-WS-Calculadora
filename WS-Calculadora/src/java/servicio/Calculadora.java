package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculadora")
public class Calculadora {

    @WebMethod(operationName = "hola")
    public String hola(@WebParam(name = "name") String txt) {
        return "Hola " + txt + " !";
    }
    
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 + num2;
    }
    
    @WebMethod(operationName = "esprimo")
    public Boolean esprimo(@WebParam(name = "numero") int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                {primo = false;}
            contador++;
        }
        return primo;  
    }
}

package ups.edu.ec.EvaluacionWSchuqui.servicios;



import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.PathParam;

import ups.edu.ec.EvaluacionWSchuqui.clases.Cuenta;
import ups.edu.ec.EvaluacionWSchuqui.funcion.GestionBancariaON;



@WebService
public class ServiceSOAP {
	
   @Inject
	private GestionBancariaON on;
	
@WebMethod
public boolean transferencia(Cuenta c, double cantidad) {
	 try {
			on.transferencia(c, cantidad);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
   }

@WebMethod
public String depositar(Cuenta c, double cantidad) {
	try {
		on.depositar(c.getIdCuenta(), cantidad);
		return "OK";
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "Error";
	}
}

@WebMethod
public String retirar(Cuenta c, double cantidad) {

try {
	on.retirar(c.getIdCuenta(), cantidad);
	return "OK";
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	return "Error";
}
}
}

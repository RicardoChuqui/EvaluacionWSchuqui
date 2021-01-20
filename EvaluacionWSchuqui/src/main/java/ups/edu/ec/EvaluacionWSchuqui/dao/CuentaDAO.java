
package ups.edu.ec.EvaluacionWSchuqui.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.EvaluacionWSchuqui.clases.Cuenta;



/**
 *
 * @author Ricardo Chuqui
 */

@Stateless
public class CuentaDAO {

	@PersistenceContext
	private EntityManager em;

	/*
	 * metodo que permite crear cuentas de los socios en la base de datos
	 */
	public void insertCuenta(Cuenta cuenta) throws Exception {

		em.persist(cuenta);

	}

	/*
  	 * metodo que permite retornar una cuenta en la base de datos por medio de su id
  	 */
	public Cuenta readCuenta(String id) throws Exception {
		return em.find(Cuenta.class, id);
	}

	/*
  	 * metodo que permite actualizar una cuenta en la base de datos
  	 */
	public void updateCuenta(Cuenta cuenta) throws Exception {
		em.merge(cuenta);
	}

	/*
  	 * metodo que permite eliminar una cuenta en la base de datos
  	 */
	public void deleteCuenta(String idCuenta) throws Exception {
		Cuenta c = readCuenta(idCuenta);
		em.remove(c);
	}

	/*
  	 * metodo que permite listar las cuenta en la base de datos por medio del tipo de cuenta
  	 */
	public List<Cuenta> getCuenta(String filtro) throws Exception {
		String jpql = "SELECT p FROM Cuenta p WHERE tipoCuenta LIKE :filtro";

		Query q = em.createQuery(jpql, Cuenta.class);
		q.setParameter("filtro", filtro + "%");
		return q.getResultList();
	}

	/*
  	 * metodo que permite hacer un deposito de saldo de la cuenta de un cliente  en la base de datos
  	 */
	public void actualizarSaldoCuenta(String idCuenta, double cantidad) throws Exception {

		String jpql = "UPDATE Cuenta p SET p.saldo = p.saldo+" + cantidad + " WHERE idcuenta='" + idCuenta + "'";

		Query query = em.createQuery(jpql);
		query.executeUpdate();

	}

	/*
  	 * metodo que permite hacer el retiro de saldo de la cuenta de un cliente  en la base de datos
  	 */
	public void actualizarRetiroCuenta(String idCuenta, double cantidad) throws Exception {

		String jpql = "UPDATE Cuenta p SET p.saldo = p.saldo-" + cantidad + " WHERE idcuenta='" + idCuenta + "'";

		Query query = em.createQuery(jpql);
		query.executeUpdate();

	}

}

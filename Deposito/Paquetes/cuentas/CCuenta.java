package cuentas;

/**
 * @author alber
 *
 */
/**
 * @author alber
 *
 */
public class CCuenta {
	
		//parametro nombre del dueño de la cuenta
		private String nombre;
		//parametro cuenta identificadora de la cuenta.
	    private String cuenta;
	    //parametro saldo que hay en la cuenta.
	    private double saldo;
	    //parametro tipoInteres que hay en la cuenta.
	    private double tipoInterés;

	    /**
	     * Inicializacion del constructor
	     */
	    public CCuenta() {
	    }

	    /**
	     * @param nom, nombre del usuario de la cuenta.
	     * @param cue, cuenta del usuario.
	     * @param sal, salario de la cuenta.
	     * @param tipo, tipo de interes de la cuenta.
	     */
	    public CCuenta(String nom, String cue, double sal, double tipo) {
	        nombre = nom;
	        cuenta = cue;
	        saldo = sal;
	    }

	    /**
	     * @return retorna el saldo de la cuenta
	     */
	    public double estado() {
	        return saldo;
	    }

	    /**
	     * @param cantidad, parametro recibido
	     * @throws Exception, si el parametro recibido es menor que 0, salta el mensaje de excepcion.
	     * si no salta la excepcion, se sumara el parametro recibido al saldo de dicha cuenta.
	     */
	    public void ingresar(double cantidad) throws Exception {
	        if (cantidad < 0) {
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        }
	        saldo = saldo + cantidad;
	    }

	    /**
	     * @param cantidad, parametro recibido.
	     * @throws Exception si el parametro es menor o igual a 0 salta el mensaje de error.
	     * si la cantidad es mayor que estado (retorna el saldo de la cuenta) salta mensaje de error.
	     * Si no se cumplen estas el parametro pasado va a restar al saldo de la cuenta y se pondra el nuevo saldo.
	     */
	    public void retirar(double cantidad) throws Exception {
	        if (cantidad <= 0) {
	            throw new Exception("No se puede retirar una cantidad negativa");
	        }
	        if (estado() < cantidad) {
	            throw new Exception("No se hay suficiente saldo");
	        }
	        saldo = saldo - cantidad;
	    }

	    
	    /**
	     * @return nombre
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    /**
	     * @param nombre
	     */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    /**
	     * @return cuenta
	     */
	    public String getCuenta() {
	        return cuenta;
	    }

	    /**
	     * @param cuenta
	     */
	    public void setCuenta(String cuenta) {
	        this.cuenta = cuenta;
	    }

	    /**
	     * @return saldo
	     */
	    public double getSaldo() {
	        return saldo;
	    }

	    /**
	     * @param saldo
	     */
	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    /**
	     * @return tipoInteres
	     */
	    public double getTipoInterés() {
	        return tipoInterés;
	    }

	    /**
	     * @param tipoInterés
	     */
	    public void setTipoInterés(double tipoInterés) {
	        this.tipoInterés = tipoInterés;
	    }

}

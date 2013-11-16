/**
 * 
 */
package edu.itszapopan.calculadora;

/**
 * @author miguel
 *
 */
public class Calculadora {

  private String txtDisplay;
  private double numDisplay;
  private short operador;
  private boolean punto;

  public static final short NO_OP = 0;
  public static final short SUMA  = 1;
  public static final short RESTA = 2;
  public static final short MULTIPLICACION  = 3;
  public static final short DIVISION  = 4;
  public static final short IGUAL  = 6;

  /**
   * Constructor de la clase Calculadora.
   */
  public Calculadora() {
	txtDisplay = new String();
	numDisplay = 0.0;
	operador = (short) 0;
	punto = false;
  }

  /**
   * Agrega un digito a la Calculadora.
   */
  public void add(char digito) {
	txtDisplay += digito;
  }

  /**
   * Agrega un punto decimal a la Calculadora.
   */
  public void addPunto() {
	if (! punto)  {
	  txtDisplay += '.';
	  punto=true;
	}
  }

  /**
   * Regresa el contenido del display.
   */
  public String get() {
	return txtDisplay;
  }

  /**
   * Configura la operación a realizar y hace el calculo
   */
  public void setOp(short operacion) {
	double tmp;
	tmp = Double.parseDouble(txtDisplay);
	switch(operador) {
	  case NO_OP:
		    numDisplay = tmp;
		    txtDisplay = "";
		  break;
	  case SUMA:
		    numDisplay += tmp;
		  break;
	  case RESTA:
		    numDisplay -= tmp;
		  break;
	  case MULTIPLICACION:
		    numDisplay *= tmp;
		  break;
	  case DIVISION:
		    if (tmp != 0.0)
		       numDisplay /= tmp;
		  break;
	}
	operador = operacion;
	if (operacion == IGUAL) {
	    txtDisplay = "" + numDisplay;
	    operador = NO_OP;
	    punto=false;
	} 
  }








}

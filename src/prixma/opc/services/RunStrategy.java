package prixma.opc.services;

/**
 * @author William Pivotto <a href="mailto:william@prixma.com.br">email</a>
 * @version RunStrategy.java, v 1.0 2009/02/16 14:26:00
 * Contrato que um objeto deve respeitar para controlar a execu��o de um servi�o;
 */

public interface RunStrategy {
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Servi�o deve ser executado ou n�o
	*/
	public boolean shouldExecute();
	
	/** Condi��o verificada ap�s a execu��o do servi�o
	 * @return Servi�o deve continuar sendo executado ou n�o
	*/
	public boolean shouldContinue();
	

}

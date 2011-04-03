package prixma.opc.services;


/**
 * Libera execu��o do servi�o permanentemente 
 * @author William Pivotto <a href="mailto:william@prixma.com.br">email</a>
 * @version RunLikeADaemon.java, v 1.0 17/02/2009 21:49:09
 */

public class RunLikeADaemon implements RunStrategy{
	
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Executa sempre
	*/
	public boolean shouldExecute() {
		return true;
	}
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Sempre executa novamente
	*/
	public boolean shouldContinue() {
		return true;
	}

	public void setService(Service servico) {}
	
	
}

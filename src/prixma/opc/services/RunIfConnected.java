package prixma.opc.services;

import prixma.opc.communication.ConnectionListener;
import prixma.opc.communication.OpcClient;


/**
 * Libera execu��o do servi�o somente se conex�o OPC estiver ativa 
 * @author William Pivotto <a href="mailto:william@prixma.com.br">email</a>
 * @version RunIfConnected.java, v 1.0 17/02/2009 21:47:48
 */

public class RunIfConnected implements RunStrategy, ConnectionListener {

	private boolean test;
	
	public RunIfConnected(){
		OpcClient.connection().addConnectionStateListener(this);
	}
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Executa sempre que conectado
	*/
	public boolean shouldExecute() {
		return test;
	}
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Sempre tenta executar novamente
	*/
	public boolean shouldContinue() {
		return true;
	}

	public void setService(Service servico) {}


	public void connected() {
		test = true;
	}

	public void disconnected() {
		test = false;
	}
	
}

package prixma.opc.services;

import prixma.opc.communication.ConnectionListener;
import prixma.opc.communication.OpcClient;




/**
 * Libera execu��o do servi�o somente se conex�o OPC estiver inativa 
 * @author William Pivotto <a href="mailto:william@prixma.com.br">email</a>
 * @version RunIfDisconnected.java, v 1.0 17/02/2009 21:48:37
 */

public class RunIfDisconnected implements RunStrategy, ConnectionListener {

	private boolean test = true;
	
	public RunIfDisconnected(){
		OpcClient.connection().addConnectionStateListener(this);
	}
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Executa sempre que desconectado
	*/
	public boolean shouldExecute() {
		return test;
	}
	
	/** Condi��o verificada antes da execu��o do servi�o
	 * @return Sempre executar novamente caso permane�a desconectado
	*/
	public boolean shouldContinue() {
		return test;
	}

	public void setService(Service servico) {}


	public void connected() {
		test = false;
	}

	public void disconnected() {
		test = true;
	}

	

}


//contrato Autenticavel
	//Quem assinar esse contrato, precisa implementar
		//metedo setSenha
		//metodo autentica
public abstract interface Autenticavel {

	public abstract void setSenha( int senha);
	
	public abstract boolean autentica( int senha);
	
}

package Abstração;

public abstract class Classe_abstrata {
	private String mensagem;

	protected String getMensagem() {
		return mensagem;
	}

	protected void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	protected abstract void mostra_mensagem();
}

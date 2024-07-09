package Aparelho;

import AparelhoMultiFuncional.AparelhoTelefonico;
import AparelhoMultiFuncional.NavegadorInternet;
import AparelhoMultiFuncional.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Reproduzindo a música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " +musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página." + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");
		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz");
		
	}

	public static void ligar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

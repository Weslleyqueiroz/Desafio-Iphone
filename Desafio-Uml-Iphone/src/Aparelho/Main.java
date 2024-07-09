package Aparelho;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone iphone = new Iphone();

        System.out.println("-----Reprodutor Musical-----");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Justin Timberlake - Mirrors");

        System.out.println("-----Aparelho Telefônico-----");
        iphone.ligar("11951280099");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("-----Navegador na Internet-----");
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
	}

}

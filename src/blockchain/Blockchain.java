package blockchain;

public class Blockchain {

	public static void main(String[] args) {
		// blockchain simples demonstrada em Java
		String frase1 = "Meu mundo � quase perfeito com Programa��o!";
		int hashDaFrase	= Math.abs(frase1.hashCode());
		
		System.out.println("Frase = \"" + frase1 + "\", criptografada com o hash: " + hashDaFrase);
	}
}

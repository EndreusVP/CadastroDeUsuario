package estudoarray;

import java.util.HashMap;
import java.util.Scanner;

public class CadastroDeUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> usuario = new HashMap<>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Crie sua conta --> \n");
		System.out.println("=====================");
		System.out.println("\nCrie seu nome de usuario\n");
		
		String nomeConta = entrada.nextLine();
		
		System.out.println("\nCrie sua senha\n");
		
		String senhaConta = entrada.nextLine();
		
		usuario.put(nomeConta, senhaConta);
		
		boolean erro = true;
		
		while(erro == true) {
			
			System.out.println("\nDigite seu nome de usuario: \n");
			
			String nomeUsuario = entrada.nextLine();
			
			System.out.println("Digite sua senha: \n");
			
			String senha = entrada.nextLine();
			
			if(usuario.containsKey(nomeUsuario) && usuario.get(nomeUsuario).equals(senha)) {
				System.out.println("Login efetuado com sucesso");
				erro = false;
			}else {
				System.out.println("Erro ao efetuar o login");
				System.out.println("Tente novamente");
				erro = true;
			}
			
		}
		
		entrada.close();

	}

}

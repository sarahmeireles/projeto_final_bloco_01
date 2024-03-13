package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
int opcao = 0;
while (true) {
	System.out.println("***************************************");
	System.out.println("  Perfumaria  Botica                   ");
	System.out.println("                                       ");
	System.out.println("***************************************");
	System.out.println("                                       ");
	System.out.println("  1- Criar Conta                       ");
	System.out.println("  2- Cadastrar Produtos                ");
	System.out.println("  3- Listar Produtos                   ");
	System.out.println("  4- Atualizar Produtos                ");
	System.out.println("  5- Apagar Produtos                   ");
	System.out.println("  6-  Sair                             ");
	System.out.println("***************************************");
	System.out.println("Entre com a opção desejada             ");
	
	opcao=leia.nextInt();
	
	if (opcao==6) {
		System.out.println("Perfumaria Botica");
		sobre();
		leia.close();
		System.exit(0);
	}
	switch (opcao) {
	case 1:
		System.out.println("Criar conta");
		break;
		
	case 2:
		System.out.println("Cadastrar Produtos\n");
		break;
		
	case 3 :
		System.out.println("Listar Produtos");
		break;
		
	case 4 :
		System.out.println("Atualizar Produtos");
		break;
		
	case 5:
		System.out.println("Apagar Produtos");
		break;
		default:
			System.out.println("\nOpção Inválida");
			break;
	}
	

	
	
	
	
	
}


	}

	private static void sobre() {
		// TODO Auto-generated method stub
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



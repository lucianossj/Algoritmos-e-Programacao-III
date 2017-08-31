package br.com.senacrs.algiii.aula3.listadencadeada;

public class Main {

	private static List<String> list;
	
	static DataReader dr = new DataReader();
	
	public static void main(String args[]) {
		
		list = new List<String>();
		
		menu();
		
	}
	
	public static void menu() {
		
		dr.print("\n .:: - Teste de Lista - ::.\n\n"
				+ "1 - Inserir String\n"
				+ "2 - Verificar conteúdo\n");
		
		int op = dr.getInt("\nEscolha um opção: ");
		
		if(op == 1) {
			
			insertString();
			
		} else if(op == 2) {
			
			verifyContent();
			
		} else {
			
			dr.print("Por favor, escolha uma opção válida!!!\n\n");
			
			menu();
			
		}
		
	}
	
	public static void insertString() {
		
		boolean control = true;
		
		while(control == true) {
			
			String data = dr.getString("\nDigite algum texto: ");
			
			list.insertBegin(data);
			
			int op = dr.getInt("\nDeseja digitar outro? Sim (1) Não (2)");
			
			if(op == 1) {
				
				control = true;
				
			} else if(op == 2) {
				
				control = false;
				
			} else {
				
				dr.print("Por favor, escolha uma opção válida!!!\n\n");
				
			}
		
		}
		
		menu();
		
	}
	
	public static void verifyContent() {
		
		dr.print("Conteúdo da Lista: \n\n");
		
		String data = "";
		
		while(!list.emptyList()) {
			
			data += "\n" + list.removeBegin();
			
			dr.print(data);
			
		}
		
	}
	
}

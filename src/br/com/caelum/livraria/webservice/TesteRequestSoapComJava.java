package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		LivrariaWS cliente = new LivrariaWSProxy();
		
		Livro[] livros = cliente.getLivrosPorTitulo("Java");
		
		for (Livro livro : livros) {
			System.out.println("id: " + livro.getId());
			System.out.println("titulo: " + livro.getTitulo());
			System.out.println("autor: " + livro.getAutor().getNome());
		}
		
	}

}

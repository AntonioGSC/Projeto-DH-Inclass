package br.com.mgoficina;

import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.impl.ClienteServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Funcionou");
		Cliente cliente1 = new Cliente("teste1", "21312412", 22, 'M');
		Cliente cliente2 = new Cliente("Teste1", "21312412", 22, 'M');
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		
		ClienteServiceImpl arrayCliente = new ClienteServiceImpl(lista);
		cliente1.setNome("Tste2");
		System.out.println(arrayCliente.updateCliente(cliente2));
		System.out.println(arrayCliente.findAll());
		arrayCliente.deleteCliente(1);
		System.out.println(arrayCliente.findAll());
	}
}

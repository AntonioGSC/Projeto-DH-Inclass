package br.com.mgoficina;

import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IClienteService;
import br.com.mgoficina.service.impl.ClienteServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Roberto", "21312412", 22, 'M', 1);
		Cliente cliente2 = new Cliente("Vinicius", "2141241412", 30, 'M', 2);
		Cliente cliente3 = new Cliente("Rogeria", "21312412", 20, 'F', 1);
		Veiculo veiculo1 = new Veiculo("23114-12", "Palio", 2014, "Vermelho", "48128458128858", "Carro", 1);
		Veiculo veiculo2 = new Veiculo("23114-12", "Fusca", 2014, "Vermelho", "48128458128858", "Carro", 2);
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		
		IClienteService clienteService = new ClienteServiceImpl();
		clienteService.create(cliente2);
		System.out.println(clienteService.findAll());
	}
}

package br.com.mgoficina;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IClienteService;
import br.com.mgoficina.service.IServicoService;
import br.com.mgoficina.service.IVeiculoService;
import br.com.mgoficina.service.impl.ClienteServiceImpl;
import br.com.mgoficina.service.impl.ServicoServiceImpl;
import br.com.mgoficina.service.impl.VeiculoServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Roberto", "21312412", 22, 'M', 1L);
		Cliente cliente2 = new Cliente("Vinicius", "2141241412", 30, 'M', 2L);
		Cliente cliente3 = new Cliente("Rogeria", "21312412", 20, 'F', 1L);
		Cliente cliente47 = new Cliente("Gabriela da Silva", "030.182.677-37", 30, 'F', 47L);
		Cliente cliente48 = new Cliente("Fabiano Melo", "401.546.432-03", 36, 'M', 48L);
		Cliente cliente49 = new Cliente("Eduarda Nogueira", "686.031.681-05", 30, 'F', 49L);
		Veiculo veiculo1 = new Veiculo("23114-12", "Palio", 2014, "Vermelho", "48128458128858", "Carro", 1L);
		Veiculo veiculo2 = new Veiculo("23114-12", "Palio", 2014, "Vermelho", "48128458128858", "Carro", 2L);
		Servico servico = new Servico(1L, LocalDate.of(2020, 1, 01), LocalDate.of(2020, 4, 1), 2301.10, "Credito", cliente49, veiculo1);
		Servico servico2 = new Servico(2L, LocalDate.of(2020, 1, 01), LocalDate.of(2020, 4, 1), 2301.10, "Credito", cliente49, veiculo2);
		Servico servico3 = new Servico(3L, LocalDate.of(2020, 1, 01), LocalDate.of(2020, 9, 1), 2301.10, "Credito", cliente2, veiculo2);
		
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente1);
		
		IClienteService clienteService = new ClienteServiceImpl();
		IVeiculoService veiculoService = new VeiculoServiceImpl();
		IServicoService servicoService = new ServicoServiceImpl();
		servicoService.create(servico);
		servicoService.create(servico2);
		servicoService.create(servico3);
		clienteService.create(cliente1);
		clienteService.create(cliente2);
		System.out.println(servicoService.findAll());
//		System.out.println(servicoService.findServicosByDatasFinalizadas(LocalDate.of(2020, 4, 1)));
		
		
//		System.out.println(clienteService.findAll());
//		clienteService.update(cliente3);
//		System.out.println(clienteService.findAll());
		
		
		
		
		
		
//		veiculoService.create(veiculo1);
//		veiculoService.create(veiculo2);
//		System.out.println(veiculoService.findAll());
//		System.out.println(veiculoService.findVeiculoByModelo("Palio"));
//		System.out.println(clienteService.findClienteByNome("Vinicaius"));
	}
}

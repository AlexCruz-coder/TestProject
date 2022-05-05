package com.metatecno.test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metatecno.test.model.Funcionario;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(TestProjectApplication.class, args);
		/*
		3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
		3.2 – Remover o funcionário “João” da lista.
		3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
		• informação de data deve ser exibido no formato dd/mm/aaaa;
		• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
		3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
		3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
		3.6 – Imprimir os funcionários, agrupados por função.
		3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
		3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
		3.10 – Imprimir a lista de funcionários por ordem alfabética.
		3.11 – Imprimir o total dos salários dos funcionários.
		3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
		*/
		
		
		//3.1 
		Funcionario maria = new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal(2009.44), "Operador");
		Funcionario joao = new Funcionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal(2284.38), "Operador");
		Funcionario caio = new Funcionario("Caio", LocalDate.of(1961, 5, 02), new BigDecimal(9836.14), "Coordenador");
		Funcionario miguel = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal(19119.88), "Diretor");
		Funcionario alice = new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal(2234.68), "Recepcionista");
		Funcionario heitor = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal(1582.72), "Operador");
		Funcionario arthur = new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal(4071.84), "Contador");
		Funcionario laura = new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal(3014.45), "Gerente");
		Funcionario heloisa = new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal(1606.45), "Eletricista");
		Funcionario helena = new Funcionario("Helena", LocalDate.of(1996, 9, 02), new BigDecimal(2799.93), "Gerente");
		
		List<Funcionario> list = new ArrayList();
		list.add(maria);
		list.add(joao);
		list.add(caio);
		list.add(miguel);
		list.add(alice);
		list.add(heitor);
		list.add(arthur);
		list.add(laura);
		list.add(heloisa);
		list.add(helena);
	
		//3.2 - Remover o usuario João da lista
		
		list.remove(joao);
		
		//3.3 - Impressao dos funcionarios
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		MathContext mc = new MathContext(7);
		
		BigDecimal aumento = new BigDecimal(1.1);
		
		for (int i =0;i<list.size();i++) {
			
			// 3.4 - Aumentando salário em 10%
			list.get(i).setSalario(list.get(i).getSalario().multiply(aumento));
			
			
			
			System.out.println("======================");
			System.out.println("Nome : " + list.get(i).getNome());
			System.out.println("Função : " + list.get(i).getFuncao());
			System.out.println("Salário : R$ " + list.get(i).getSalario().round(mc));
			System.out.println("Data de Nascimento : " + list.get(i).getDataNascimento().toString());
	}
		
		
	}

}

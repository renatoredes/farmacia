package br.com.drogaria.dao;

import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.drogaria.domain.Funcionario;
import br.com.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {

	@Test

	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);

		Funcionario funcionario = new Funcionario();
		funcionario.setCarteiraTrabalho("123456789");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("25/01/2018"));
		funcionario.setPessoa(pessoa);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
		

		System.out.println("Funcionario salvo com sucesso.");
	}
}

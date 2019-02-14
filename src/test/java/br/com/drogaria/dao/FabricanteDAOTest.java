package br.com.drogaria.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cidade;
import br.com.drogaria.domain.Estado;
import br.com.drogaria.domain.Fabricante;;

public class FabricanteDAOTest {
	@Test
//	@Ignore
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("São Paulo");
		//estado.setSigla("SP");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}
}
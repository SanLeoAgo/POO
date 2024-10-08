package biblioteca;

import java.util.Calendar;

public class TestarLivro {

	public static void main(String[] args) {
		Livro livro=new Livro();
		livro.setIsbn("11111111");
		
		Calendar dataLancamento=Calendar.getInstance();
		dataLancamento.set(Calendar.DAY_OF_YEAR,1);
		dataLancamento.set(Calendar.MONTH,0);
		dataLancamento.set(Calendar.YEAR,2000);

		livro.setDataLancamento(dataLancamento);
		livro.setTitulo("Meu Livro");
		livro.setEdicao(1);
		livro.setNumPaginas(200);
		
		Autor autor=new Autor();
		autor.setGeneroLiterario("Romance");
		autor.setNome("Machado de Assis");
		livro.setAutor(autor);
		
		System.out.println(livro.getTitulo());
		System.out.println(livro.getAutor().getNome());
		System.out.println(livro.getDataLancFmt());
		livro.getAutor().setNome("Fernando Pessoa");

	}

}

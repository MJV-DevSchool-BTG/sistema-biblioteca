package mjv.sistemabiblioteca;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaBibliotecaApplication.class, args);
		System.out.println("Rodouuuuu!!");
	}
	
	@Bean
	public CommandLineRunner run(ApplicationSample as) throws Exception {
		return args -> {
			as.cadastrarLivroSample();
//			as.criarCadastroSample();
//			as.gerarLocacaoSample();
		
			System.out.println("Cadastro realizado com sucesso");

		};
	}

}
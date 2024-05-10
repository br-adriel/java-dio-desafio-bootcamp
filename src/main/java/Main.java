import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var curso1 = new Curso(
                "Curso Java",
                "Descrição do curso",
                60
        );
        var curso2 = new Curso(
                "Curso Javascript",
                "Descrição do curso",
                40
        );

        var mentoria = new Mentoria(
                "Mentoria de Java",
                "Descrição da mentoria",
                LocalDate.now()
        );

        var bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        var devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fulano: " + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fulano: " + devFulano.getConteudosConcluidos());

        var devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteúdos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao: " + devJoao.getConteudosConcluidos());
    }
}

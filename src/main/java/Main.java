import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(
                "Curso Java",
                "Descrição do curso",
                60
        );
        Curso curso2 = new Curso(
                "Curso Javascript",
                "Descrição do curso",
                40
        );
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria(
                "Mentoria de Java",
                "Descrição da mentoria",
                LocalDate.now()
        );
        Mentoria mentoria2 = new Mentoria(
                "Mentoria de Python",
                "Descrição da mentoria",
                LocalDate.now()
        );
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}

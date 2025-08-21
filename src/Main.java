
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Fundamentos de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tira-dúvidas sobre Java e mercado");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao profissional");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEverton = new Dev();
        devEverton.setNome("Everton");
        devEverton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Everton: " + devEverton.getConteudosInscritos());
        devEverton.progredir();
        devEverton.progredir();
        System.out.println("Conteúdos Concluídos Everton: " + devEverton.getConteudosConcluidos());
        System.out.println("XP Everton: " + devEverton.calcularTotalXp());

        System.out.println("-----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria: " + devMaria.calcularTotalXp());
    }
}
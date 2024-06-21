package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao javascript");
        curso2.setCargaHoraria(4);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        // System.out.println(curso2);
        //  System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos"+ devNicolas.getConteudosInscritos());

        devNicolas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos"+ devNicolas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+ devNicolas.getConteudosConcluidos());
        System.out.println("XP" + devNicolas.calcularTotalXp());

        Dev devGabrielle = new Dev();
        devGabrielle.setNome("Gabrielle");
        devGabrielle.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos"+ devGabrielle.getConteudosInscritos());

        System.out.println("--------------------------");

        devGabrielle.progredir();
        devGabrielle.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos"+ devGabrielle.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+ devGabrielle.getConteudosConcluidos());
        System.out.println("XP" + devNicolas.calcularTotalXp());




    }
}

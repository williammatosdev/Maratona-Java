package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José de Assis";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + ",Idade:" + professor.idade + ",Sexo:" + professor.sexo+".");
    }
}

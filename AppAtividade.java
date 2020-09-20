package Vinícius_burci.atividade;

public class AppAtividade {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("joao", 20, 99999-9999);
        Funcionario pedro = new Funcionario();

        pedro.setNome("pedro");
        System.out.println(pedro.getNome());
        System.out.println(joao.getIdade());

        pedro.setNome("felipe");
        System.out.println(pedro.getNome());
    }
}

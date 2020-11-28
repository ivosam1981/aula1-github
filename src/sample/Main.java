package sample;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> funcionariosList = new ArrayList<>();
        Funcionarios funcionarios;

        System.out.println("Deseja cadastrar quantos funcionários?  ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            System.out.println("Informe o Id do funcionario: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe o nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.println("Informe o salário do funcionário: ");
            Double salario = sc.nextDouble();

            System.out.println("Funcionario #" + i+1 + ":");
            System.out.println("Id: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);

            funcionarios = new Funcionarios(nome, id, salario);
            funcionariosList.add(funcionarios);
        }

        System.out.println("Entre com o id do funcionario que deseja aumentar o salario ");
        Integer id = sc.nextInt();
        Double percent = null;

        for(Funcionarios func : funcionariosList){
            if(func.getId() == id){
                System.out.println("Entre com o percentual do aumento ");
                 percent = sc.nextDouble();
                double acrescimo = func.getSalary() * (percent / 100);
                func.setSalary(func.getSalary() + acrescimo);
            }
        }

        if(percent == null){
            System.out.println("Não foram encontrados funcionários com o numero de Id informado ");
        }
        System.out.println("Lista de Funcionários ");

        for(int i=0; i<n; i++){
          funcionarios = funcionariosList.get(i);
          System.out.println(funcionarios.getId() + ", " +funcionarios.getName() + ", " + funcionarios.getSalary());
        }










        sc.close();
    }


}

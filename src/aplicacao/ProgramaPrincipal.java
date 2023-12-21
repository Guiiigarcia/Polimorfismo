package aplicacao;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Funcionario> lista = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Funcionário #"+(i+1));
            System.out.print("Tercerizado? (S/N)");
            char p = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            if(p == 'S'){
                System.out.println("Custo adicional: ");
                double ca = sc.nextDouble();
                Funcionario f1 = new FuncionarioTercerizado(nome,horas,valorHora,ca);
                lista.add(f1);
            }else{
                Funcionario f1 = new Funcionario(nome,horas,valorHora);
                lista.add(f1);
            }
        }

        System.out.println();
        System.out.println("Pagamentos: ");

        for(Funcionario c: lista){
            System.out.println(c.getNome()+" - R$"+String.format("%.2f",c.pagamentos()));
        }

        sc.close();
    }

}

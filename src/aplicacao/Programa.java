package aplicacao;

import entidades.Freelancer;
import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        double n = sc.nextDouble();


        for(int i=0; i<n; i++) {

            System.out.println("Funcionario #"+(i+1) +" Dados:");
            System.out.print("Funcionário interno? (S/N): ");
            char fn = (sc.next()).charAt(0);

            if (fn == 'S') {
                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Horas: ");
                int horas = sc.nextInt();

                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();

                lista.add(new Funcionario(nome, horas, valorHora));

            } else if (fn == 'N'){
                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Horas: ");
                int horas = sc.nextInt();

                System.out.print("Valor por hora: ");
                double valorHora = sc.nextDouble();

                System.out.print("Despesas adicionais: ");
                double despesas = sc.nextDouble();
                lista.add(new Freelancer(nome, horas, valorHora, despesas));

            }

        }

        System.out.println("---------------------------");
        System.out.println("Pagamentos: ");
        for (Funcionario f: lista){
            System.out.println(f.getNome()+ " - $" +f.pagamento());
        }
    }
}

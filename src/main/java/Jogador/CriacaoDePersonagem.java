package Jogador;
import Personagem.Criacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class CriacaoDePersonagem {
    public static Criacao criarPersonagem() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Criacao personagem = new Criacao();
        ArrayList<String> classe = new ArrayList<>();
        String[] classes = {"Guerrreiro", "Mago", "Arqueiro"};
        String[] raca = {"Humano", "Elfo", "Anão"};
        System.out.print("Digite o nome do personagem: ");
        personagem.setNome(scanner.nextLine());
        System.out.print("Escolha sua classe: ");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        System.out.println("3. Arqueiro");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                personagem.setNomeClasse(classes[0]);
                personagem.setForca(10);
                personagem.setMagia(0);
                break;
            case 2:
                personagem.setNomeClasse(classes[1]);
                personagem.setForca(0);
                personagem.setMagia(10);
                break;
            case 3:
                personagem.setNomeClasse(classes[2]);
                personagem.setForca(5);
                personagem.setMagia(5);
                break;
            default:
                System.out.println("Opção inválida! Definindo classe padrão: Guerreiro");
                personagem.setNomeClasse(classes[0]);
                personagem.setForca(10);
                personagem.setMagia(0);
                break;
        }
        System.out.print("Digite a idade do personagem: ");
        personagem.setIdade(scanner.nextInt());
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Escolha sua raça: ");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Anão");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                personagem.setRaca(raca[0]);
                break;
            case 2:
                personagem.setRaca(raca[1]);
                break;
            case 3:
                personagem.setRaca(raca[2]);
                break;
            default:
                System.out.println("Opção inválida! Definindo raça padrão: Humano");
                personagem.setRaca(raca[0]);
                break;
        }
        System.out.println("\n=== Personagem Criado ===");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Classe: " + personagem.getNomeClasse());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Raça: " + personagem.getRaca());
        System.out.println("Força: " + personagem.getForca());
        System.out.println("Magia: " + personagem.getMagia());
        scanner.close();


    return personagem;}
    }

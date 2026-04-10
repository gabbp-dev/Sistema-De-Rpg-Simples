package Jogo;
import Jogador.CriacaoDePersonagem;
import Inimigo.Boss;
import Inimigo.StatusBoss;
import Personagem.Criacao;
public class Play {
    static void main(String[] args) {
        //Criar Personagem
            Criacao personagem = CriacaoDePersonagem.criarPersonagem();
            //Boss
        StatusBoss boss = Boss.bossCriado();

        //Mostrar Confronto
        System.out.println("==== Batalha iniciada ====");
        System.out.println("Jogador: " + personagem.getNome());
        System.out.println("idade: " + personagem.getIdade() + " anos");
        System.out.println("Classe: " + personagem.getNomeClasse());
        System.out.println("Raça: " + personagem.getRaca());
        System.out.println("Força: " + personagem.getForca());
        System.out.println("Magia: " + personagem.getMagia());

        System.out.println("\nBoss: " + boss.getNome());
        System.out.println("Raça" + boss.getRaca());
        System.out.println("Vida: " + boss.getVida());


    }
}

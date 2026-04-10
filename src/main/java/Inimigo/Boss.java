package Inimigo;
import Inimigo.StatusBoss;


public class Boss {
    public static StatusBoss bossCriado() {
        StatusBoss boss = new StatusBoss();

        boss.setNome("Seraphon, o Corrompido");
        boss.setRaca("Monstro");
        boss.setForca(35);
        boss.setVida(50);
        return boss;
    }
}

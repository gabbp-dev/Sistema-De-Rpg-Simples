# Sistema de RPG Simples

Um jogo de RPG simples desenvolvido em Java, onde o jogador pode criar seu personagem e enfrentar um boss.

## 📁 Estrutura do Projeto
src/
├── Personagem/
│   └── Criacao.java         # Atributos base do personagem
├── Jogador/
│   └── CriacaoDePersonagem.java  # Criação e input do jogador
├── Inimigo/
│   ├── StatusBoss.java      # Atributos do boss
│   └── Boss.java            # Configuração do boss
└── Jogo/
└── Play.java            # Classe principal

-----------------------------------------------

## ⚔️ Classes disponíveis

| Classe | Força | Magia |
|--------|-------|-------|
| Guerreiro | 10 | 0 |
| Mago | 0 | 10 |
| Arqueiro | 5 | 5 |

## 👾 Boss

**Seraphon, o Corrompido**
- Raça: Monstro
- Força: 35
- Vida: 50

## 🚀 Como rodar

1. Clone o repositório:
```bash
   git clone https://github.com/gabbp-dev/Sistema-De-Rpg-Simples.git
```
2. Abra no IntelliJ IDEA
3. Rode a classe `Play.java`

## 🛠️ Tecnologias

- Java
- IntelliJ IDEA

## 🔜 Próximas features

- [ ] Sistema de combate por turnos
- [ ] Mais classes e raças
- [ ] Mais bosses

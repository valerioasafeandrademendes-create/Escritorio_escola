import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogador j1 = new Jogador();

        System.out.println("Digite seu nome: ");
        j1.nome = sc.nextLine();
        System.out.println("Digite seu nickName: ");
        j1.nickName = sc.nextLine();
        System.out.println("Digite sua idade: ");
        j1.idade = sc.nextInt();
        System.out.println("Digite jogo Favorito: ");
        j1.jogoFavorito = sc.nextLine();
        System.out.println("Digite seu nivel: ");
        j1.nivel = sc.nextInt();

        System.out.println("nome do jogador: " + j1.nome);
        System.out.println("nick do jogador: " + j1.nome);
        System.out.println("idade do jogador: " + j1.nome);
        System.out.println("jogo favorito do jogador: " + j1.nome);
        System.out.println("nivel do jogador: " + j1.nome);


    }

}
import java.util.Scanner;
public class AppArvore {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Arvore arvore = new Arvore(new Elemento(teclado.nextInt()));
        System.out.println(arvore.printArvore(0));

        while (true) {
            arvore = arvore.inserir(new Elemento(teclado.nextInt()));
            arvore.calcularBalanceamento();
            System.out.println(arvore.printArvore(0));
        }
    }
}

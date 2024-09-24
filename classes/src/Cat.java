import java.util.Scanner;
public class Cat {
    /*
    Variáveis de instancia: Estado do gato
     */
    String nome;
    String cor;
    int peso;

    /*
    Contrutor
     */
    public Cat(String nome, String cor, int peso){
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;

        System.out.println(nome + " MEOW!");

    }

    /*
    Métodos de instancia: Comportamento do gato
     */
    public int conta(){
        Scanner scan = new Scanner(System.in);
        System.out.println(nome + " sabe matematica¹");
        System.out.println("Diga um numero: ");
        int num1 = scan.nextInt();
        System.out.println("Diga outro numero: ");
        int num2 = scan.nextInt();
        return num1 + num2;
    }
    void sleep(){
        System.out.println(nome +" está dormindo.");
    }

    void eat(){
        System.out.println(nome + " está comendo.");
    }
    void play(){
        System.out.println(nome + " está brincando.");
    }
}

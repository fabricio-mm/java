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

/*
public: Acesso irrestrito.
private: Acesso restrito à própria classe.
protected: Acesso dentro do pacote e por herança.
abstract: Classe não pode ser instanciada e pode conter métodos abstratos.
 */

public class Main {
    public static void main(String[] args) {


        Cat thomas = new Cat("Thomas", "Laranja", 14); //definindo os atributos do gato no construtor
        thomas.eat(); thomas.play(); thomas.sleep(); //métodos void, eles não precisam de paramentos, apenas retornam as instruções

        System.out.println();

        Cat alfredo = new Cat("Alfredo", "Preto", 12);
        System.out.println("O gato se chama: "+ alfredo.nome);
        System.out.println("A cor de alfredo é: " + alfredo.cor);
        System.out.println(alfredo.peso + "Kgs é o peso de Alfredo");
    }
}

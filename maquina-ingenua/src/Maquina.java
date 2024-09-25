import java.util.Scanner;
public class Maquina {
    Scanner scan = new Scanner(System.in);
    int ticket_viagem;
    int ticket_alimento;
    int ticket_gasolina;
    private int choice;

    public Maquina(int ticket_viagem, int ticket_alimento, int ticket_gasolina ){

        this.ticket_viagem = ticket_viagem;
        this.ticket_alimento = ticket_alimento;
        this.ticket_gasolina = ticket_gasolina;
        System.out.println("Bem vindo! Segue a lista de preços.");
        System.out.println("[1]: Viagem para Madrid: $"+ ticket_viagem);
        System.out.println("[2]: Alimento, qualquer alimento: $" + ticket_alimento);
        System.out.println("[3]: Gasolina, o necessário: $" + ticket_gasolina);
        choice = scan.nextInt();
        Venda(choice);
    }
    private void Venda(int choice){
        this.choice = choice;
        switch (choice){
            case 1:
                System.out.println("Insira o valor do ticket viagem.");
                int value = scan.nextInt();
                while (true){
                    if (value <= ticket_viagem){
                        int restante = ticket_viagem - value;
                        while (restante !=0){
                            System.out.println("Restante $"+ restante);
                            int resto = scan.nextInt();
                            restante = restante - resto;
                        }
                        System.out.println("Boa viagem!");
                        break;
                    }
                }
                return;
            case 2:
                System.out.println("Insira o valor do ticket de alimentação.");
                int value_alimento = scan.nextInt();
                System.out.println("Boas compras!");
                return;
            case 3:
                System.out.println("Insira o valor do ticket de gasolina.");
                int value_gasolina = scan.nextInt();
                System.out.println("Bomba liberada! Dirija com cuidado.");

        }
    }
}


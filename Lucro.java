import java.util.Scanner;

public class Lucro{

    private int numeroClientes;

    public int getNumeroClientes() {
        return numeroClientes;
    }


    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }


    public Lucro(int numeroClientes){
        this.numeroClientes = numeroClientes;
    }
    

    public void calcularMediaGastoPorCliente(){
        Scanner input = new Scanner(System.in);

        double precoBebida, precoComida, mediaCliente;
        int numBebidas, numComidas;

        int quantClientes[] = new int[numeroClientes];
        double mediaGastosClientes[] = new double[numeroClientes];

        for(int i = 0; i < quantClientes.length; i++){
            System.out.println("Digite o numero de bebidas que o cliente " + (i + 1) + " comprou: ");
            numBebidas = input.nextInt();

            System.out.println("Digite o preço da bebida: ");
            precoBebida = input.nextDouble();

            System.out.println("Digite o numero de comidas que o cliente " + (i + 1) + " comprou: ");
            numComidas = input.nextInt();

            System.out.println("Digite o preço da comida: ");
            precoComida = input.nextDouble();

            mediaCliente = ((numBebidas * precoBebida) + (numComidas * precoComida)) / 2;

            mediaGastosClientes[i] = mediaCliente;
        }

        for(int i = 0; i < mediaGastosClientes.length; i++){
            System.out.println("A média de gastos do cliente " + (i + 1) + " é: " + mediaGastosClientes[i]);
        }

        input.close();
    }
    
    public void calcularMediaGeral(){
        Scanner input = new Scanner(System.in);

        double bebidas = 0, comidas = 0, somaGastos = 0, mediaSimples;

        int quantClientes[] = new int[numeroClientes];
        double gastosClientes[] = new double[numeroClientes];

        for(int i = 0; i < quantClientes.length; i++){
            System.out.print("Quanto que o cliente " + (i+ 1) + " gastou em comidas: ");
            comidas = input.nextDouble();

            System.out.print("Quanto que o cliente " + (i+ 1) + " gastou em bebidas: ");
            bebidas = input.nextDouble();

            gastosClientes[i] = comidas + bebidas;
        }

        for(int i = 0; i < gastosClientes.length; i++){
            somaGastos += gastosClientes[i];
        }

        mediaSimples = somaGastos / numeroClientes;

        System.out.println("A média Geral é: " + mediaSimples);

        input.close();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroClientes;

        System.out.println("Digite o numero de clientes: ");
        numeroClientes = input.nextInt();

        Lucro lucro = new Lucro(numeroClientes);
        lucro.calcularMediaGeral();

        input.close();
    }
}
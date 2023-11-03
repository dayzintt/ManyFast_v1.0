package ManyFast;
import java.util.*;
public class Produtos {
    static Scanner sc = new Scanner(System.in);
    public String local;
    public double valor;
    public String food;
    public int quant;
    public double total;

    public void pedeLocal(){
        System.out.println("digite local");
        local = sc.nextLine();
    }
    String local(){
        return local;
    }

    public void pedeFood(){
        System.out.println("digite o pedido");
        food = sc.nextLine();
    }
    String voltafood(){
        return food;
    }

    public void pedeQuant(){
        System.out.println("digite a quantidade");
        quant = sc.nextInt();
    }
    int voltaQuant(){
        return quant;
    }

    public void pedeValor(){
        System.out.println("defina valor: ");
        valor = Double.parseDouble(sc.nextLine());
    }



    public void printaPedido(){
        System.out.print("***********************"+"Pedido"+"***********************");
        System.out.print("\nconsumir em: "+ local);
        System.out.print("\n***********************descrição***********************\n");
        System.out.print("\n\npedido:"+food+ "\tquantidade:"+quant);
        System.out.print("\ntotal:\t\t"+total);

    }
}

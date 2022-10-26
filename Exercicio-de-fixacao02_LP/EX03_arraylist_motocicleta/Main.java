package EX03_arraylist_motocicleta;

public class Main {

    public static void main(String[] args) {
        Moto mt1, mt2, mt3; 
        mt1 = new Moto();
        mt2 = new Moto();
        mt3 = new Moto();

        mt1.nome = "CB 250";
        mt1.cor = "Preta";
        mt1.valor = 14500.00;

        mt2.nome = "CB 250";
        mt2.cor = "Preta";
        mt2.valor = 14500.00;

        mt3.nome = "CB 250";
        mt3.cor = "Preta";
        mt3.valor = 14500.00;
        

        Agencia agencia = new Agencia();

        agencia.nome = "Motoboys"; 

        agencia.adicionaMoto(mt1);
        agencia.adicionaMoto(mt2);
        agencia.adicionaMoto(mt3);

        System.out.println(agencia.getQuantidadeMotos());

        System.out.println(agencia);

    }
}
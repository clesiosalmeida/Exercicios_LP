package EX01_arraylist_concenssionaria;

public class Main {
    public static void main(String[] args) {
        
        
        Carro c1 = new Carro(); 
        c1.nome = "Palio";
        c1.cor = "Coniza";

    Carro c2 = new Carro();
    c2.nome = "Gol";
    c2.cor = "Preto";

    Agencia ag = new Agencia(); 
    ag.nome = "Concenssionária dois irmãos";
    ag.adicionarCarro(c1);
    ag.adicionarCarro(c2);
    
    int qtdCarros = ag.getQuantidadeCarros();

    System.out.println(qtdCarros);
    
}


}

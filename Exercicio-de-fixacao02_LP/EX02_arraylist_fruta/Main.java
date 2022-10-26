package EX02_arraylist_fruta;

public class Main {
    public static void main(String[] args) {
        Fruta f1 = new Fruta(); 
        f1.nome = "Melancia"; 
        f1.valor = 1.98;
        
        Fruta f2 = new Fruta(); 
        f2.nome = "Uva"; 
        f2.valor = 5.40;
        
        Fruta f3 = new Fruta(); 
        f3.nome = "Banana";
        f3.valor = 2.80; 
        
        Sacolao sacolao = new Sacolao();

        sacolao.nome = "Sacolão ABCD"; 

        sacolao.adicionaFruta(f2);
        sacolao.adicionaFruta(f1);
        sacolao.adicionaFruta(f3);
        
        sacolao.listarItens();

        // System.out.println(sacolao);

        System.out.println("TOTAL:"+sacolao.valorTotal());
        

    }
}

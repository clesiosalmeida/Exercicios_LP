package EX02_arraylist_fruta;

import java.util.ArrayList;

public class Sacolao {

    String nome; 

    ArrayList<Fruta> listaDeFrutas = new ArrayList<>();
    
    public void adicionaFruta(Fruta fruta){
        listaDeFrutas.add(fruta);
    }

    public int getQuantidadeFrutas(){
        return listaDeFrutas.size();
    }
    
    @Override
    public String toString() {
        return "Sacolao [nome=" + nome + ", listaDeFrutas=" + listaDeFrutas + "]";
    }
    
    public double valorTotal(){
        double total = 0; 

        for (Fruta precoFruta: listaDeFrutas){
            total = total + precoFruta.getValor();
        }

        return total;
    }

    public void listarItens(){
        for(int i = 0; i<listaDeFrutas.size(); i++){
            System.out.println("item "+(i+1)+" : " + listaDeFrutas.get(i));
        }

        

    }


    

    
}

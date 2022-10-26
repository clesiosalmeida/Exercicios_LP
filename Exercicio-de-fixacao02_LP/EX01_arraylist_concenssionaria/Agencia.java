package EX01_arraylist_concenssionaria;

import java.util.ArrayList;

public class Agencia {

    String nome;
    
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }


    public int getQuantidadeCarros(){
        return listaCarros.size();
    }


}

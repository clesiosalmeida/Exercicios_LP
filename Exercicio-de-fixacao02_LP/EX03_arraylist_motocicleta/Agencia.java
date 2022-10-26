package EX03_arraylist_motocicleta;

import java.util.ArrayList;

public class Agencia {

    String nome;

    ArrayList<Moto> listaDeMotos = new ArrayList<Moto>();

    public void adicionaMoto(Moto moto){
        listaDeMotos.add(moto);
    }

    public int getQuantidadeMotos(){
        return listaDeMotos.size();
    }

    @Override
    public String toString() {
        return "Agencia [nome=" + nome + ", listaDeMotos=" + listaDeMotos + "]";
    }

    
}

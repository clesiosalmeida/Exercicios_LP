package EX02_arraylist_fruta;

public class Fruta {
    String nome;
    double valor;

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome + " | " + valor;
    }

    
}

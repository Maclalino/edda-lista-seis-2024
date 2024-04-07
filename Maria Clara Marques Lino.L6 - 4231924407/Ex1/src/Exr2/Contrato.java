package Exr2;

public interface Contrato {
    public void adicionarItem(String nome, Double preco);
    public Compras buscarItemPorNome(String nome);
    public void listarCompras();
}

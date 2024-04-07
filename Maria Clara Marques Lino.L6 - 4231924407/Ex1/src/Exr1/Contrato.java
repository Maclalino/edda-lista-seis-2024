package Exr1;
public interface Contrato {
    public void adicionarContato(String nome, String telefone, String numero);
    public Contato buscarContatoPorNome(String nome);
    public void listarContatos();
}

package Exr1;
import java.util.ArrayList;
import java.util.List;


    public class ListaDeContatos implements Contrato {
    private List<Contato> contatos;

    public ListaDeContatos() {
        this.contatos = new ArrayList<>();  //armazenar os contatos
    }

    @Override
    public void adicionarContato(String nome, String telefone, String numero) {
        Contato novoContato = new Contato(nome, telefone,numero);
        contatos.add(novoContato);
    }

    @Override
    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; 
    }

    @Override
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Lista de contatos está vazia.");
            return;
        }

        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
}
    }

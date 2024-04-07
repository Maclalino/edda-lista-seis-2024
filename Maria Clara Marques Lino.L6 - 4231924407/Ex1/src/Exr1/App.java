package Exr1;
public class App {
   public static void main(String[] args) {
    ListaDeContatos lista = new ListaDeContatos();

        lista.adicionarContato("Maria", "319967267", "5273632873");
        lista.adicionarContato("Joao", "734247432", "3183863228");


        lista.listarContatos();

        Contato contato = lista.buscarContatoPorNome("Maria");
        if (contato != null) {  //verificando se o conato existe
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
   }
}

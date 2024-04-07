import java.time.LocalDate;

public class AlgoritmoBusca {
    private int chave;
    private String nome;

    public AlgoritmoBusca() {
    }

    public AlgoritmoBusca(int chave, String nome) {
        this.chave = chave;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int buscaBinaria(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (fim + inicio) / 2;
            if (array[meio] == chave)
                return meio;

            if (array[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public void imprimirResultado(int chave, int indice) {
        if (indice != -1) {
            System.out.println("A chave " + chave + " foi encontrada no índice " + indice + ".");
        } else {
            System.out.println("A chave " + chave + " não foi encontrada.");
        }
    }

    public void imprimirPlacas(int chave, int indice) {
        LocalDate data = LocalDate.now();
        System.out.println("\tRegistro: " + data);
        if (indice != -1) {
            System.out.println(
                    "Carro/Placa: " + chave + " foi o " + (indice + 1) + "° " + "carro que trafegou na via.\n");
        } else {
            System.out.println("O Carro/Placa " + chave + " não foi encontrada.");
        }
    }

    public void imprimirGuardaVolumes(String nome, int chave, int indice) {
        if (indice != -1) {
            System.out.println(
                    "\n" + nome + " está no guarda volume " + chave + " e foi encontrada no índice " + indice + ".");
        } else {
            System.out.println("A chave " + chave + " não foi encontrada.");
        }
    }
}
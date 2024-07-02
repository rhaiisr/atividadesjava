public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nomePessoa, int idadePessoa) {
        nome = nomePessoa;
        idade = idadePessoa;
    }

    public void detalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade" + idade);
        
    }
}

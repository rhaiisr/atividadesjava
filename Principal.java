public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Roberto", 34);
        Pessoa pessoa2 = new Pessoa("Joao", 19);
        Pessoa pessoa3 = new Pessoa("Angela", 25);


        Livro livro = new Livro("É assim que acaba");
        Bicicleta bicicleta = new Bicicleta("Caloi");
        Musica musica = new Musica("Palpite");

        pessoa1.detalhes();
        pessoa2.detalhes();
        pessoa3.detalhes();

        livro.detalhes();
        bicicleta.detalhes();
        musica.detalhes();
    }


}

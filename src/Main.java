public class Main {
    public static void main(String[] args) {

        Turista mochileiro = new Turista();

        mochileiro.nome = "Anderson";
        mochileiro.cpf = "123";

        String retorno = mochileiro.viagar();
        System.out.println(retorno);
    }
}
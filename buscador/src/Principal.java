
public class Principal {
    public static void main(String[] args) {
        ConsultaCep consulta = new ConsultaCep();
        Endereco novoEndereco = consulta.buscaEndereco("01001000");
        System.out.println(novoEndereco);
    }
}
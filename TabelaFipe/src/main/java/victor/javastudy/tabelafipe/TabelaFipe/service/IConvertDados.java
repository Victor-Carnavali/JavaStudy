package victor.javastudy.tabelafipe.TabelaFipe.service;

public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}

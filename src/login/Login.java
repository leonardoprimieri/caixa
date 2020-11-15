package login;
import arquivos.Armazenavel;
import arquivos.ManterArquivos;

import java.util.Map;
import java.util.HashMap;

public class Login implements Armazenavel{


    public String nome;
    public String senha;
    Map<String, String> usuarios = new HashMap<String, String>();

    @Override
    public String toString() {
        return "Usuário" + ManterArquivos.espaco + nome + ManterArquivos.espaco + "conectou";
    }

    public Login() {
        usuarios.put("Leonardo", "12345");
        usuarios.put("Daylan", "54321");
    }

    public Boolean eUmUsuario(String nome, String senha) {
        return usuarios.containsKey(nome) && usuarios.containsValue(senha);

    }

    @Override
    public String getArquivo() {
        return "login.txt";
    }
}

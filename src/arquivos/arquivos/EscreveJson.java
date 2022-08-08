package arquivos.arquivos;

import arquivos.Usuario;
import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscreveJson {
    public static void main(String[] args) throws IOException {
        Usuario usuario1 = new Usuario();
        usuario1.setCpf("125426");
        usuario1.setLogin("joao");
        usuario1.setSenha("565656");
        usuario1.setNome("Leonardo");

        Usuario usuario2 = new Usuario();
        usuario2.setCpf("87878797");
        usuario2.setLogin("jajaja");
        usuario2.setSenha("454545");
        usuario2.setNome("Ledesma");

        List<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonUser = gson.toJson(usuarios);
        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter("D:\\JDev\\listas2\\src\\arquivos\\arquivos\\filejson.json");
        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();

        /* --------------- Lendo arquivo Json --------------*/

        FileReader fileReader = new FileReader("D:\\JDev\\listas2\\src\\arquivos\\arquivos\\filejson.json");

        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
        List<Usuario> listUsuarios = new ArrayList<Usuario>();

        for(JsonElement jsonElement : jsonArray){ // cada chave do nosso arquivo é um jsonelement.
            Usuario usuario = new Gson().toJson(jsonElement, Usuario.class);

            listUsuarios.add(usuario);

        }

        String listUsuario;
        System.out.println("Leitura do arquivo json " +  listUsuario);







    }
}

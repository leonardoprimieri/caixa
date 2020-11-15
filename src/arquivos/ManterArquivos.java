package arquivos;

import java.io.*;

public class ManterArquivos {

    private static String diretorio;
    public static final String espaco = " ";

    static{

        diretorio = System.getProperty("user.home");
    }

    public static void gravarArquivo(Armazenavel objeto, Boolean sobrescrever){

        String caminhoCompleto = getCaminhoCompleto(objeto.getArquivo());

        try (FileWriter fw = new FileWriter(caminhoCompleto, sobrescrever);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            out.println(objeto.toString());

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void lerArquivo(Armazenavel objeto){
        String caminhoCompleto = getCaminhoCompleto(objeto.getArquivo());

        try(BufferedReader br = new BufferedReader(new FileReader(caminhoCompleto))){

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private static String getCaminhoCompleto(String arquivo){

        return diretorio + File.separator + arquivo;
    }
}

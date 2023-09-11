package adpter;

import java.io.File;

public class Teste {
    public static void main(String args[]) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}

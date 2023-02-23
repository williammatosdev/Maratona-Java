package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados...");
    }
   @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissões no Banco de Dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface na classe DataBaseLoader");
    }

}

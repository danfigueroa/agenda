package agendacontatos;

/**
 * @author Daniel Figueroa
 */

public class AgendaContatos {
   
    public static void main(String[] args) {
        
        Escritor novoArquivo = new Escritor();
        Leitor agenda = new Leitor();
        
        novoArquivo.escreverArquivo();
        
        //agenda.lerArquivo();
        
    }
}

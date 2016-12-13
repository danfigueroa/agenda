package agendacontatos;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Daniel Figueroa
 */

public class Escritor {
    
    public String nome;
    public String telefone;
    public String email;
    
    Contato c = new Contato();
    
    
    public void escreverArquivo() {       
        
        try {
            FileOutputStream arquivo = new FileOutputStream("agenda_contatos.txt", true);
            PrintWriter pr = new PrintWriter(arquivo);       
            
            c.setNome(nome);
            c.setTelefone(telefone);
            c.setEmail(email);
            
            pr.println("---------------------------------------------------------");
            pr.println("Nome: " + c.getNome());
            pr.println("Telefone: " + c.getTelefone());
            pr.println("E-mail: " + c.getEmail());
            pr.println("---------------------------------------------------------");
                        
            pr.close();
            arquivo.close();
        }
        catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo");
        }
    }
    
}

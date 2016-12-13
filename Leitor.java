package agendacontatos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 * @author Daniel Figueroa
 */

public class Leitor {
    
    public void lerArquivo() {    
        
        try {
            FileInputStream arquivo = new FileInputStream("agenda_contatos.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            String linha;
            
            do {
                linha = br.readLine();
                
                if(linha != null) {
                    JOptionPane.showMessageDialog(null, linha);
                    //System.out.println(linha);
                }
            } while (linha != null);
            
            
        }
        catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo");
        }
    }
    
}

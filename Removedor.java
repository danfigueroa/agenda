package agendacontatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Daniel Figueroa
 */

public class Removedor {
    
    public String deletar;
    
    public void excluirLinha() {
        
        try {
            FileInputStream arquivo = new FileInputStream("agenda_contatos.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            //FileWriter fw = new FileWriter(arquivo);
            //BufferedWriter bw = new BufferedWriter(fw);
            
            String linha = br.readLine();
            
            ArrayList<String> salvar = new ArrayList();
            
            while(linha != null) {
                
                if(linha.equals(deletar) == false) {
                    salvar.add(linha);
                }
            }
            
            /*for(int i=0; i<salvar.size(); i++) {
                bw.write(salvar.get(i));
                bw.newLine();
            }*/
            
            br.close();
            arquivo.close();  
            
        }
        catch (IOException ex) {
            System.out.println("Erro ao deletar o arquivo");
        }
        
        
    }
    
    
}

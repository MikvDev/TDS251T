/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojinha.util;
import java.io.File;
import java.io.IOException;
// importações para manipular arquivos de forma moderna
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
// importações para trabalho com data e horario
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

        
 /**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class imageStorage {
    // Define o nome da pasta onde as imagens serão salvas
    private static final String PASTA_IMAGENS = "imagens";
    // Método esátio para salvar image,
    // Recebe um arquivo e retorna o caminho salvo
    public static String salvarImagem(File arquivo) throws IOException{
        // Cria o diretório de imagens caso não exista
        try {
            // Se Nenhuma Arquivo for enviado, retorna null
            if(arquivo==null)return null;
            // Cria objeto que representa a pasta "Imagem"
            File pasta = new File(PASTA_IMAGENS);
            // se a pasta não existir , ela é criado
            if(!pasta.exists())pasta.mkdir();
            // Gera data/hora
            //Serve para criar nome unico
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            // Remove espaço e troca por "_"
            String nomeOrigin = arquivo.getName().replaceAll("\\s+","_");
            // Cria novo nome:
            String novoNome = timestamp+"_"+nomeOrigin;
            // Define o caminho de destino
            Path destino = Path.of(PASTA_IMAGENS,novoNome);
            Files.copy(
            arquivo.toPath(),
            destino,
            StandardCopyOption.REPLACE_EXISTING      
            );
            //Retorna o caminho da Imagem
            return PASTA_IMAGENS+ "/"+novoNome;
        } catch (Exception e) {
            // Caso de erro, mostra a mensagem
             throw new RuntimeException("Erro ao Enviar Imagem: "+ e.getMessage());
        }
        }
    
}

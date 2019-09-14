package cube.communication;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Writer {
    public static void writer(ArrayList<String> moves) throws IOException{
        Path path = Paths.get("/home/felipe/Área de trabalho/text.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
           for(String i : moves){
               w.write(i);
           }
        }
        
    }
}

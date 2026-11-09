package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    String getFirstLine() {
        String firstLine = "";
        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/FileReader/BufferedReaderVsScanner.txt"))){
            firstLine = reader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        return firstLine;
    }

    String getWholeFile(){
        String wholeFile = "";

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/FileReader/BufferedReaderVsScanner.txt"))){
            StringBuilder builder = new StringBuilder();
            reader.lines().forEach(line -> builder.append(line + " "));
            wholeFile = builder.toString();
        } catch (IOException e){
            e.printStackTrace();
        }

        return wholeFile;
    }
}

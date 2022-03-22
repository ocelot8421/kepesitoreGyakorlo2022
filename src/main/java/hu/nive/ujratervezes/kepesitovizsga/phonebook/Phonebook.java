package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        Path pathOutput = Path.of(output);

//        try { //VAGY  try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOutput, StandardOpenOption.WRITE,  StandardOpenOption.CREATE)) {
//            Files.createFile(pathOutput);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOutput, StandardOpenOption.WRITE,  StandardOpenOption.CREATE)) {
            for (Map.Entry<String, String> contact : contacts.entrySet()) {
                String s = contact.getKey() + ": " + contact.getValue() + "\n";
                bufferedWriter.write(s);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}

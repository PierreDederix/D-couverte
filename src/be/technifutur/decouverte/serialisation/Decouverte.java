package be.technifutur.decouverte.serialisation;

import be.technifutur.decouverte.collection.Personne;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decouverte {

    public static void main(String[] args) {
        List<Personne> plus30 = load();
        if (plus30.isEmpty()){
            System.out.println("Liste vide");
            plus30 = getPlus30();
        } else {
            plus30.forEach(System.out::println);
        }
        save(plus30);
        // getPlus30().forEach(System.out::println);

    }

    private static void save(List<Personne> plus30) {
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("mesdatas.txt"))){
            output.writeObject(plus30);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Personne> load() {
        List<Personne> result;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("mesdatas.txt"))) {
            result = (List<Personne>) input.readObject();
        } catch (FileNotFoundException e) {
            result = new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static List getPlus30() {
        return Arrays.asList(Personne.getPersonnes())
                .stream()
                .filter(p -> p.getAge()>30)
                .toList();
    }
}

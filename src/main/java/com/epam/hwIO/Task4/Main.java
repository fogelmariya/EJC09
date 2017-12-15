package com.epam.hwIO.Task4;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main implements Serializable {

    public static void main(String[] args) {
        String outFileName = "outFileFilm.txt";
        Set<Film> film = new HashSet<>();
        Set<Film> newFilm;
        film.add(new Film("Harry Potter", "Daniel Redkliff", "Harry Potter"));
        film.add(new Film("Harry Potter", "Emma Wotson", "Germiona"));
        film.add(new Film("Pirates of the Caribbean", "Johnny Depp", "Jake Sparrow"));

        try( ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
             BufferedWriter out = new BufferedWriter(new FileWriter(outFileName))) {
            Object objectSave = film;
            objectOutputStream.writeObject(objectSave);
            objectOutputStream.close();

            byte[] byteArray = outputStream.toByteArray();
            outputStream.close();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Object objectRead = objectInputStream.readObject();
            inputStream.close();
            objectInputStream.close();

            newFilm = (HashSet<Film>) objectRead;
            newFilm.add(new Film(" Chokolat", "Johny Depp", "Roux"));

            for (Film tmpfilm: newFilm) {
                out.write(" " + tmpfilm.actor + " play in film " + tmpfilm.name + " role " + tmpfilm.role + "\n");
            }
            out.close();

        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.util.*;
import java.nio.file.*;
import java.util.stream.*;
import java.io.*;

public class Voog{
  public static void main(String[] args)throws Exception{
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("valjund.txt"));

    Files.readAllLines(Paths.get("input.txt")).
      stream().
      filter(s -> Integer.parseInt(s.split(",")[2]) > 160).
      sorted(Comparator.comparing(s -> s.split(",")[2])).
      map(s -> "Õpilane " + s.split(",")[0] + ", pikkusega " + s.split(",")[2] + " cm, on pikem kui 160 cm").
      collect(Collectors.toList()).
      forEach(kirjutaja::println);
    kirjutaja.close();
  }
}

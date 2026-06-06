package estruturaDados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> box = new HashMap<>();

        System.out.print("Digite o caminho do arquivo: ");
        String patch = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (box.containsKey(name)) {
                    int totalVotes = box.get(name);
                    box.put(name, votes + totalVotes);
                } else {
                    box.put(name, votes);
                }

                line = br.readLine();
            }

            TreeMap<String, Integer> map = new TreeMap<>(box);

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

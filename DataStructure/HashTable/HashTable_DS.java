package HashTable;

import java.util.Hashtable;

public class HashTable_DS {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10, 0.5f);

        table.put("100", "Toi thay hoa vang tren co xanh");
        table.put("123", "De Men phieu luu ky");
        table.put("321", "Toi yeu em");
        table.put("555", "Lao Hac");
        table.put("777", "Data structure & Algorithm");
        table.put("740", "Bi kiep tan gai nha ho Nguyen");
        table.put("741", "Bi kiep tan gai nha ho Nguyen 1");
        table.put("742", "Bi kiep tan gai nha ho Nguyen 2");
        table.put("743", "Bi kiep tan gai nha ho Nguyen 3");

        // Is empty table
        System.out.println("Is empty table: " + table.isEmpty());

        // Size
        System.out.println("Size of hash table: " + table.size());

        // Search
        System.out.println(table.containsKey("743"));
        System.out.println(table.containsValue("Bi kiep tan gai nha ho Nguyen"));

        // Remove
        table.remove(444);

        for (String key : table.keySet()) {
            System.out.println(
                    key.hashCode() % table.size() + " [Key = " + key + ", Value = \"" + table.get(key) + "\"]");
        }
    }
}

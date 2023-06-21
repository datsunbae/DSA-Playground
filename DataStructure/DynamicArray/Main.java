
public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("222222222");
        dynamicArray.add("11111111111");

        System.out.println("Is Empty: " + dynamicArray.isEmpty());

        System.out.println("size: " + dynamicArray.size);

        dynamicArray.insert(1, "44444");
        System.out.println(dynamicArray);

        dynamicArray.delete("11111111111");
        System.out.println("Search: " + dynamicArray.search("11111111111"));

        System.out.println(dynamicArray);

    }
}

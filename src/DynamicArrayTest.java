public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("D");
        dynamicArray.insert(2, "C");
        dynamicArray.delete("B");

        System.out.println(dynamicArray);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Empty?: " + dynamicArray.isEmpty());
        System.out.println(dynamicArray.search("C"));

        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        System.out.println(dynamicArray);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Empty?: " + dynamicArray.isEmpty());

        dynamicArray.delete("C");
        dynamicArray.delete("G");
        dynamicArray.delete("D");

        System.out.println(dynamicArray);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Empty?: " + dynamicArray.isEmpty());
    }
}

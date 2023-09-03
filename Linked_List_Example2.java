import java.util.LinkedList;

public class MyClass {
  public static void main(String arg[]) {
    LinkedList travelBucketList = new LinkedList();

    // Add Items
    travelBucketList.add("Mogadishu, Somalia");  
    travelBucketList.add("Barcelona, Spain");
    travelBucketList.add("Santorini, Greece");
    travelBucketList.add("Toronto, Canada");
    travelBucketList.add(2, "Los Angeles, California");
    System.out.println(travelBucketList);

    // Access
    System.out.println(travelBucketList.get(2));
    System.out.println(travelBucketList.getFirst());

    System.out.println(travelBucketList.contain("Barcelona, Spain"));

    // Remove Items
    travelBucketList.removeFirst();
    travelBucketList.removeLast();
    System.out.println(travelBucketList);

    travelBucketList.remove("Santorini, Greece");  // remove by object
    travelBucketList.remove(0); // remove by index
    System.out.println(travelBucketList);  // print contents of LL
  }
}

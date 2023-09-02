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
  }
}

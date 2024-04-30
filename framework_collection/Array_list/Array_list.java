
package framework_collection.Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);

    System.out.println(cars.size());
    System.out.println(cars.get(3));
    String removee = cars.remove(3);
    System.out.println(removee);
    System.out.println(cars.size());
    System.out.println(cars);
    // cars.addAll(cars);
    // cars.removeAll(cars);
    Collections.sort(cars);
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }

  }

}

package Buoi2;

import java.lang.reflect.Array;
import java.util.*;

public class ManagerVehicle {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle(){} ;
        vh.Intro();


        //Da hinh
        Vehicle vcar = new Car();
        vcar.Intro();

        //ArrayList
        System.out.println("ArrayList");
        ArrayList<Car> carsArrayList = new ArrayList<>(Arrays.asList(
                new Car(1, "Xe 1", 200.2f, "Honda", 100000000),
                new Car(2, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(4, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(6, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(1, "Xe 2", 200.2f, "Audi", 200000000)
        ));
        carsArrayList.add(new Car(3, "Xe 3", 200.2f, "Huyndai", 200000000));
        carsArrayList.remove(1);
        carsArrayList.set(1, new Car(5, "Xe 5", 200.2f, "Huyndai", 200000000));
        carsArrayList.sort((c1, c2) -> Integer.compare(c2.getId(), c1.getId()));
        carsArrayList.forEach(n -> System.out.println(n));
        System.out.println("\n\n");
        System.out.println("LinkedList");
        //LinkedList
        LinkedList<Car> carLinkedList = new LinkedList<>(Arrays.asList(
                new Car(1, "Xe 1", 200.2f, "Honda", 100000000),
                new Car(2, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(3, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(6, "Xe 2", 200.2f, "Audi", 200000000),
                new Car(7, "Xe 2", 200.2f, "Audi", 200000000)
        ));
        carLinkedList.add(new Car(4, "Xe 4", 200.2f, "Huyndai", 200000000));
        carLinkedList.remove(1);
        carLinkedList.addFirst(new Car(0, "Xe 1", 200.2f, "Honda", 100000000));
        carLinkedList.set(1, new Car(5, "Xe 5", 200.2f, "Huyndai", 200000000));
        carLinkedList.sort((c1, c2) -> Integer.compare(c2.getId(), c1.getId()));
        carLinkedList.forEach(n -> System.out.println(n));
        System.out.println("\n\n");
        //HashMap
        System.out.println("HashMap");
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "audi");
        mp.put(2, "Huyndai");
        mp.put(3, "Toyota");
        mp.put(1, "Audi");
        mp.replace(2, "Mer");
        mp.putIfAbsent(4,"Nissan");
        for(var item : mp.keySet()){
            System.out.println(item + " - " + mp.get(item));
        }


        System.out.println("\n\n");
        System.out.println("HashSet");
        Set<Car> setCar = new HashSet<>(carsArrayList);
        setCar.add(new Car(5, "Xe 1", 200.2f, "Honda", 300000000));
        for(Car car : setCar){
            System.out.println(car);
        }

        System.out.println("\n\n");
        System.out.println("Iterator");
        Iterator<Car> inte = carLinkedList.iterator();
        while(inte.hasNext()){
            System.out.println(inte.next());
        }


    }
}

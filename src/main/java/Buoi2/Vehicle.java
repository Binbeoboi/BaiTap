package Buoi2;


import java.util.Objects;

//Lop cha
abstract class Vehicle {
    private int id;
    private String name;
    private float speed;

    //Constructor khong tham so
    public Vehicle() {
    }

    //Constructor co tham so truyen vao
    public Vehicle(int id, String name, float speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass())return false;
        Vehicle vehicle = (Vehicle)obj;
        return id == vehicle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " , "  + name + ", " + speed+ ", ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void print(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(speed);
    }

    //Phuong thuc ao
    void Intro(){
        System.out.println("This is a Vehicle");
    }
}

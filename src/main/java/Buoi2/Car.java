package Buoi2;


import java.util.Objects;

//Lop con Car ke thua lop cha Vehicle
//-> TINH KE THUA (class Vehicle và implemnts Move)
class Car extends Vehicle implements Move {
    private String manufacturer;
    private long price;

    //Constructor cos tham so truyen vao
    public Car(int id, String name, float speed, String manu, long price) {
        super(id, name, speed);
        manufacturer = manu;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if (!(obj instanceof Car)) return false;
        if(!super.equals(obj)) return false;
        return true;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Car(int id, String name, float speed) {
        super(id, name, speed);
    }


    //Constructor khong tham so
    public Car(){

    }
    //Cac ham getter & setter -> TINH DONG GOI
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufac) {
        switch (manufac){
            case Audi -> manufacturer = "Audi";
            case Toyota -> manufacturer = "Toyota";
            case Hyundai -> manufacturer = "Huyndai";
            default -> manufacturer = "nothing";

        }
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString() + manufacturer + ", "  +price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    //goi lai ham ke thua
    public void print(){
        super.print();
        System.out.println(manufacturer);
        System.out.println(price);
    }

    //Da hinh
    @Override
    void Intro(){
        System.out.println("This is a car");
    }

    //Phuong thuc Acceleration(), Deceleration()ốc tu Interface Move
    @Override
    public void Acceleration() {
        setSpeed(10);

    }

    @Override
    public void Deceleration() {
        setSpeed(1);
    }

    //Inner class Clas trong 1 class
    class Engine{
        private String internalCombustionEngine;
        private String electronicEngine;
        private String hybirdEngine;

        public String getInternalCombustionEngine() {
            return internalCombustionEngine;
        }

        public void setInternalCombustionEngine(String internalCombustionEngine) {
            this.internalCombustionEngine = internalCombustionEngine;
        }

        public String getElectronicEngine() {
            return electronicEngine;
        }

        public void setElectronicEngine(String electronicEngine) {
            this.electronicEngine = electronicEngine;
        }

        public String getHybirdEngine() {
            return hybirdEngine;
        }

        public void setHybirdEngine(String hybirdEngine) {
            this.hybirdEngine = hybirdEngine;
        }
    }
}

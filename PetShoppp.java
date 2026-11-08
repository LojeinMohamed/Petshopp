
package petshoppp;


public class PetShoppp {

    
    public static void main(String[] args) {

    Pet<Number> p1 = new Pet<>("Luna", "Persian Cat", 500, 2, "Black");
    Pet<Number> p2 = new Pet<>("lolo", "Siamese Cat", 350, 1, "White");
    Pet<Number> p3 = new Pet<>("Bella", "British Cat", 450, 3, "Gray");

    
    Owner o1 = new Owner("lojein", "Tripoli");
    Owner o2 = new Owner("Taha", "Misrata");

    
    Doctor d1 = new Doctor("Ali", "Veterinary Doctor");
    Doctor d2 = new Doctor("Sara", "Animal Specialist");

    
    Appointment a1 = new Appointment("Luna", "Sara", "Dr. Ali", "10:00 AM");
    Appointment a2 = new Appointment("Milo", "Ahmed", "Dr. Sara", "12:00 PM");
    Appointment a3 = new Appointment("Bella", "Sara", "Dr. Ali", "02:00 PM");

    
    Chinic chinic = new Chinic(d1, d2, a1, a2, a3);

    
    DryFood f1 = new DryFood("Cat Food", 50, 2);
    DryFood f2 = new DryFood("Kitten Food", 35, 1);
    DryFood f3 = new DryFood("Premium Food", 75, 3);

    
    Accessory ac1 = new Accessory("Cat Collar", 15);
    Accessory ac2 = new Accessory("Cat Toy", 10);
    Accessory ac3 = new Accessory("Cat Bed", 60);

    
    Bird b1 = new Bird("Parrot", 150, "Green");
    Bird b2 = new Bird("Canary", 80, "Yellow");
    Bird b3 = new Bird("Lovebird", 100, "Blue");

    
    System.out.println("===== PET SECTION =====");
    p1.display();
    p2.display();
    p3.display();

    
    System.out.println("\n===== OWNER SECTION =====");
    o1.display();
    o2.display();

    
    System.out.println("\n===== CLINIC SECTION =====");
    chinic.display();

   
    System.out.println("\n===== DRY FOOD SECTION =====");
    f1.display();
    f2.display();
    f3.display();

    
    System.out.println("\n===== ACCESSORIES SECTION =====");
    ac1.display();
    ac2.display();
    ac3.display();

    
    System.out.println("\n===== BIRDS SECTION =====");
    b1.display();
    b2.display();
    b3.display();

    
    System.out.println("\n===== PET PRICES =====");
    Show.showPrice(p1);
    Show.showPrice(p2);
    Show.showPrice(p3);

}} class Pet<T> {
String name;
String type;
T price;
int age;
String color;

public Pet(String name, String type, T price, int age, String color) {
    this.name = name;
    this.type = type;
    this.price = price;
    this.age = age;
    this.color = color;
}

public String getName() {
    return name;
}

public T getPrice() {
    return price;
}

public void display() {
    System.out.println("Name: " + name + ", Type: " + type + ", Price: " + price + ", Age: " + age+ ", Color: " + color);
}}

class Owner{
String name;
String address;

public Owner(String name, String address) {
    this.name = name;
    this.address = address;}

public void display() {
    System.out.println("Owner: " + name + ", Address: " + address);
}}

class Doctor{
String name;
String specialization;

public Doctor(String name, String specialization) {
    this.name = name;
    this.specialization = specialization;}

public void display() {
    System.out.println("Doctor: " + name+ ", Specialization: " + specialization);
}}

class Appointment{
String petName;
String ownerName;
String doctorName;
String time;

public Appointment(String petName, String ownerName,
        String doctorName, String time) {

    this.petName = petName;
    this.ownerName = ownerName;
    this.doctorName = doctorName;
    this.time = time;
}

public void display() {
    System.out.println("Pet: " + petName
            + ", Owner: " + ownerName
            + ", Doctor: " + doctorName
            + ", Time: " + time);
}
}
class Chinic{
Doctor doctor1;
Doctor doctor2;

Appointment appointment1;
Appointment appointment2;
Appointment appointment3;
   
public Chinic(Doctor doctor1, Doctor doctor2,
        Appointment appointment1,
        Appointment appointment2,
        Appointment appointment3) {

    this.doctor1 = doctor1;
    this.doctor2 = doctor2;
    this.appointment1 = appointment1;
    this.appointment2 = appointment2;
    this.appointment3 = appointment3;
}

public void display() {

    System.out.println("--- Doctors ---");
    doctor1.display();
    doctor2.display();

    System.out.println("--- Appointments ---");
    appointment1.display();
    appointment2.display();
    appointment3.display();
}
    }
class DryFood {
String name;
double price;
int quantity;

public DryFood(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

public void display() {
    System.out.println("Food: " + name
            + ", Price: " + price
            + ", Quantity: " + quantity);
}
}
 class Accessory {
String name;
double price;

public Accessory(String name, double price) {
    this.name = name;
    this.price = price;
}

public void display() {
    System.out.println("Accessory: " + name
            + ", Price: " + price);
}
}
 class Bird {
String type;
double price;
String color;

public Bird(String type, double price, String color) {
    this.type = type;
    this.price = price;
    this.color = color;
}

public void display() {
    System.out.println("Bird: " + type
            + ", Price: " + price
            + ", Color: " + color);
}
}
 class Show {
     static void showPrice(Pet<? super Number> pet) {

    System.out.println("Pet Name: " + pet.getName());
    System.out.println("Pet Price: " + pet.getPrice());
}
}  
 
    

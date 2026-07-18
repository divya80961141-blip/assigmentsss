public class car2 {
    
String barnd1;
String model1;

car2()
{
barnd1="Tata Motors";
model1="Nexon";
}
void brand1()
{
    System.out.println(barnd1);
}
void model1(){
    System.out.println(model1);
}
public static void main(String[] args) {
    car2 car=new car2();

    car.brand1();
    car.model1();
}
}


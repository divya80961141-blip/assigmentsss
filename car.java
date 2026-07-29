public class car extends vehicle {

String Model;
String fueltype;

 void Model(){
    System.out.println(Model);
 }
void fueltype(){
    System.out.println(fueltype);
}


public static void main(String[] args){
    car c  = new car();
    c.brand = "maruti suzuki";
    c.color = "white";
    c.Model = "swift";
    c.fueltype = "petrol";
 
    c.brand();
    c.color();
    c.Model();
    c.fueltype();
}

}
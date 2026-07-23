public class moblie2 {
    
String brand;
int ram;
int storage;
public moblie2(String  brand, int ram,int storage)
{
this.brand=brand;
this .ram=ram;
this.storage=storage;
}
void brand(){
    System.out.println("Brand:" + brand);

}
void ram(){
    System.out.println("Ram:" + ram);

}
void storage(){
    System.out.println("STORAGE:" + storage);
}
public static void main(String[] args) {
   moblie2 m2=new moblie2("Redmi", 12, 65);
   m2.brand();
   m2.ram();
   m2.storage();
}
}



public class moblie {
    
String brand;
int ram;
int storage;
moblie(){
    brand="samsung";
    ram=8;
    storage=128;
}
void brand(){
    System.out.println("Brand:" + brand);
}
void ram(){
    System.out.println("RAM:" +ram);
}
void storage(){
    System.out.println("STORAGE:" + storage);
}
public static void main(String[] args){
    moblie m1=new moblie();
    m1.brand();
    m1.ram();
    m1.storage();

}
}
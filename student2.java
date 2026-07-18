public class student2 {
    
 String name;
 int age;
public student2(String name, int age){

    this.name = name;
    this.age = age;
}
void name(){
    System.out.println(name);
}
void age(){
    System.out.println(age);
}
public static void main(String[] args) 
    {
          student2 s= new student2("chinni", 20);

s.name();
s.age();
}
}


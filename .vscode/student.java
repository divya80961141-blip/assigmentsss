public  class student{

    String  Name;

    int age;
    
     student(){
      Name= "divya";
      age = 19;
     }

    void Name()
    {
        System.out.println(Name);

    }
    void age(){
        System.out.println(age);
    }
    public static void main(String[] args){
        student student1= new student();

        student1.Name();
        student1.age();
    }
}
    









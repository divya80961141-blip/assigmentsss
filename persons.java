public class persons extends person{

  int rollno;
  String course;

  void rollno(){
    System.out.println("rollno:" + rollno);
  } 
  void course(){
    System.out.println("course:" + course);
  }

    
  
  public static void main(String[] args){
    persons p = new persons();
    p.name ="varshini";
    p.course ="Bsc(mscs)";
    p.age = 20;
    p. rollno = 8;
  
    p.Name();
    p.course();
    p.age();
    p.rollno();
  }
}


 
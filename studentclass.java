
  public class studentclass {
   private String Name;
   private int rollno;
   private int marks;

   public studentclass() {
   }

   public String getName() {
      return this.Name;
   }

   public int getRollno() {
      return this.rollno;
   }

   public int getmarks() {
      return this.marks;
   }

   public void setName(String name) {
      this.Name = name;
   }

   public void setRollno(int rollno) {
      this.rollno = rollno;
   }
     public void setMarks(int marks) {
      this.marks = marks;
   }

   public void studentmarks(int marks) {
      if (marks >= 35) {
         System.out.println("pass");
      } else {
         System.out.println("fail");
      }

   }
}





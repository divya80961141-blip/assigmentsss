public class rectangle extends shapes{
    
int  length;
int width;
 void length(){
    System.out.println(length);
 }
 void width(){
    System.out.println(width);
 }
 public static void main(String[] args) {
    
 
rectangle r = new rectangle();
r.shape ="rectangle";
r.color ="red";
r.length = 10;
r.width = 5;
 
r.shape();
r.color();
r.length();
r.width();
 }
}


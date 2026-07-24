public class detalis1 {
    
int ldNo;
String Name;
 
 public int getLdNo() {
    return ldNo;
}
    
public String getName() {
    return  Name;
}
public void  setldNo( int ldNo ) {
    this.ldNo=ldNo;
}
public void setName(String Name){
    this.Name=Name;
}
public detalis1(int ldNo, String Name){
    this.ldNo=ldNo;
    this.Name=Name;
}
public static void main(String[] args){
    detalis1 d2=new detalis1(45, "laxmi");
    d2.setName("neeraja");
    d2.setldNo(60);
System.out.println( d2.getLdNo());
System.out.println(d2.getName());
}
}




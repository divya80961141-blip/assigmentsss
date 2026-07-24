public class details {
    
private int ld;
private String deparement;

public void setld(int ld) {
    this.ld = ld;
}
public void setDeparement(String deparement) {
    this.deparement = deparement;
}
public int getId() {
    return ld;
}
public String  getDeparement() {
    return deparement;
}
public details(int ld, String deparement){
     this.ld=ld;
     this.deparement=deparement;
}
}


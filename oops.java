//encapuslation
class color{
    private String colorName;

    public String getColorName() {
        return colorName;
    }
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
//abstraction
abstract class college{
    abstract void collegeName();
}
//inheritance + polymorphism
class Department extends college {
    //override
    void collegeName(){
        System.out.println("college name: kshatriya junior college");

    }
}
public class oops extends color{
    public static void main(String[] args){
        //encapuslation
         color c = new color();
        c.setColorName("Blue");
        System.out.println(c.getColorName());
         
        
    }

    
}
    
        
    




    
    

     
    


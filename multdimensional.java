public class multdimensional {
    
public static void main(String[] args) {
    int[][] Mynumbers={{1,2,3},{4,5,6},{7}};

    for(int row=0; row<Mynumbers.length ; row++ ){

    for(int col=0; col<Mynumbers[row].length ; col++){
        System.out.println( Mynumbers[row][col]);
    }
    }
}
}

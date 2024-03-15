import java.util.*;

public class Pascal
{
    /*THIS SHOULD BE CHANGED TO HIGHER NUMBERS FOR TESTING!!!*/
    private static int numRows = 1; //sets the levels of recursion; this starts at 0 but you should test it at larger values
    /*****************************/
    public static void main(String[] args){
        try{
            numRows = Integer.parseInt(args[0]);
        }
        catch(Exception e){}
        ArrayList<Integer> init = new ArrayList<Integer>();
        init.add(1);
        makerow(init, numRows);
    }
    
    public static void makerow(ArrayList<Integer> arr, int n){
        //To be implemented with recursion and a call to printrow
    }
    public static void printrow(ArrayList<Integer> arr){
        int initblank = (numRows*2-1 - (arr.size()*2-1))/2;
        for (int i = 0; i < initblank; i++){
            System.out.print(" ");
        }
        for (int i:arr){
            System.out.print(i + " " );
        }
        System.out.println();
    }
}

public class conditions {
    public static void main(String [] args){
        //if else and if else if conditions;
        int a=15;
        if (a==10) {
            System.out.println("yes! you are right");
        }else if (a==15 && a==10) {
            System.out.println("second case is also right!");
        } else if (a==15 || a==10) {
            System.out.println("third case is also correct!");
        }
            
        // else if (!(a==15)) {
        //     System.out.println("you are right!");
        // }
        else{
            System.out.println("you are wrong!");
        }
    }
}

public class testfile {
    public static void main(String[] args) {
        whileEx();
        if (whileEx() == true) {
            System.out.println("All good");
        } else {
            System.out.println("False methode");
        }
    }

    public static boolean whileEx(){
        int value = 10;
        boolean result = true;
        while (value > 0){
            result = false;
        }
        return result;
    }
}



// whileEx();
//     }

//     public static boolean whileEx(){
//         int value = 10;
//         boolean result = true;
//         while (value > 0){
//             result = false;
//         }
//         return result;
//     }
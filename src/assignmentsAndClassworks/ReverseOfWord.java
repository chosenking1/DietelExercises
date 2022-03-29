package assignmentsAndClassworks;

public class ReverseOfWord {
    public static void main(String[] args) {

        String word = "Balloon";
        for(int i = word.length() -1; i >= 0; i--){
            System.out.print(""+word.charAt(i));
        }
//        char[] theArray = new char [4] ;
// String river = "MiSsisSippi";

 String newString = "  chair  man  ";
        System.out.println("");
        System.out.println(newString.trim());
        System.out.println(newString.replaceAll(" ",""));

//        System.out.println(newString.trim().concat(newString));

    }
}

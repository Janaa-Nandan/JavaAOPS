package JavaAOPS.SaturdayAssignmentWeek1;

public class ISBNverifier{
    public static void main(String[] args) {
        System.out.println(isbnverifier("3-598-21508-8"));
        System.out.println(isbnverifier("3-598-21508-2"));
    }
    public static boolean isbnverifier(String isbn){
        int sum = 0;
        int multi = 10;
        for (int i = 0; i < isbn.length(); i++){
            if (isbn.charAt(i) != '-'){
                sum += Character.getNumericValue(isbn.charAt(i))*multi;
                multi--;
            }
        }
        if (sum%11==0)return true;
        else return false;
    }
}

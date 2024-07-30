package JavaAOPS.SaturdayAssignmentWeek1;

public class DiamondProblem {
    static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        diamond('C');
        System.out.println();
        diamond('B');
        System.out.println();
        diamond('Z');
    }
    public static void diamond(char alpha){
        int index = alphabets.indexOf(alpha);
        String str = repeat("*",index)+alpha+repeat("*",index)+'\n';
        for (int i = index-1;i >=0 ; i--){
            str += repeat("*",i)+alpha+repeat("*",(index-i-1)*2)+"*"+alpha+repeat("*",i)+'\n';
        }
        for (int i = 1;i < index ; i++){
            str += repeat("*",i)+alpha+repeat("*",(index-i-1)*2)+"*"+alpha+repeat("*",i)+'\n';
        }
        str+=repeat("*",index)+alpha+repeat("*",index);
        System.out.println(str);
    }
    public static String repeat(String str,int num){
        String newstr = "";
        for (int i = 0; i < num; i++){
            newstr += str;
        }
        return newstr;
    }
}

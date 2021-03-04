
import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        int nilaiUTS,nilaiUAS;
        String grade;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inputkan nilai UTS : ");
        nilaiUTS = input.nextInt();
        System.out.println("Inputkan nilai UAS : ");
        nilaiUAS = input.nextInt();
        
        if(nilaiUTS >= 80 && nilaiUAS >= 80){
            grade = "A";
        }else if (nilaiUTS >= 80 && nilaiUAS >= 65){
            grade = "B";
        }else if (nilaiUTS >= 65 && nilaiUAS >= 50){
            grade = "D";
        }else if (nilaiUTS >= 50 && nilaiUAS >= 35){
            grade = "D";   
        }else{
            grade = "E";
        }
        System.out.println("Grade: "+grade);
    }
}

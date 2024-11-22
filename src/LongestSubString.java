import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LongestSubString {
    //Lay tat ca chuoi con cua chuoi dau vao
    public static ArrayList<String> getAllSubstrings(String input) {
        ArrayList<String> substrings = new ArrayList<>();
        //Lay tat ca chuoi con
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                substrings.add(input.substring(i, j));
            }
        }
        return substrings;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        //Lay tat ca chuoi con cua chuoi nhap vao
        ArrayList<String> allSubstrings = getAllSubstrings(input);
        //Sap xep chuoi con theo do dai va thu tu tu be den lon
        Collections.sort(allSubstrings, (a,b)->{
            if(a.length() != b.length()){
                return Integer.compare(a.length(), b.length()); //Sap xep theo do dai
            }else {
                return a.compareTo(b); //Sap xep tu be den lon
            }
        });
        System.out.println("Chuoi con co do dai lon nhat la: " + allSubstrings.get(allSubstrings.size() - 1));
    }
}

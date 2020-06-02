
import java.util.Scanner;

public class Answer {

    public Answer() {
    }

    //dao nguoc chuoi
    void f1() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
            if (i == 0) {
                System.out.println("\n");
            }
        }
    }

    //dem so tu trong chuoi gia su cac tu cach nhau 1 khoang trang
    void f2() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] array = s.split(" ");
        System.out.println("the number of word : " + array.length);
    }
    
    //dem so nguyen am trong day
    void f3() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String vowel = "ueoai";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String stringAt = s.charAt(i) + "";
            if (vowel.contains(stringAt)) {
                count++;
            }
        }
        System.out.println("the number of vowel : " + count);
    }
    //dem so tu co chua it nhat 1 nguyen am: nguyen ba nnn mz v => 2
    void f31(){
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String vowel = "ueoai";
        int count = 0;
        String[] arrayS = s.split(" ");
        for(String string: arrayS){
            for(int i=0;i<string.length();i++){
                String stringAt = string.charAt(i)+"";
                 if (vowel.contains(stringAt)) {
                count++;
                break;
            }
            }
        }
        System.out.println(count);
    }
    //thay the String tai vi tri can
    String replaceIndex(String s, String replace, int index) {
        String[] array = new String[2];
        array[0] = s.substring(0, index);
        array[1] = s.substring(index + 1);
        return array[0] + replace + array[1];
    }

    //chuyen nguyen am in hoa thanh thuong va nguoc lai
    void f4() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'u':
                    s = replaceIndex(s, "U", i);

                    break;
                case 'e':
                    s = replaceIndex(s, "E", i);
                    break;
                case 'o':
                    s = replaceIndex(s, "O", i);
                    break;
                case 'a':
                    s = replaceIndex(s, "A", i);
                    break;
                case 'i':
                    s = replaceIndex(s, "I", i);
                    break;
                case 'U':
                    s = replaceIndex(s, "u", i);
                    break;
                case 'E':
                    s = replaceIndex(s, "e", i);
                    break;
                case 'O':
                    s = replaceIndex(s, "o", i);
                    break;
                case 'A':
                    s = replaceIndex(s, "a", i);
                    break;
                case 'I':
                    s = replaceIndex(s, "i", i);
                    break;
            }
        }
        System.out.println(s);
    }
    
    /*
    -Tach so ra khoi chuoi: nguyen45bazz222a8 => {45,222,8}
    */
    int[] filterNumber(String s){
        String number="";
         //moi nguoi co the tim hieu them ve wrapper Character de lam theo cach khac
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {  //cho dieu kien co the dung Character.isDigit
                number = number + c;
                if (i == s.length() - 1) {
                    continue;
                }
                if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9') {
                    number += " ";
                }
            }
        }
        String[] arrayNumStr = number.split(" ");
        int[] arrayNum = new int[arrayNumStr.length];
        int sum = 0;
        for (int i = 0; i < arrayNumStr.length; i++) {
           arrayNum[i]= Integer.parseInt(arrayNumStr[i]);
        }
        return arrayNum;
    }
    //tinh tong cac so tim duoc trong string
    void f5() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String number = "";
        int sum = 0;
        int[] arrayNum = filterNumber(s);
        for(int x: arrayNum){
            sum+=x;
        }
        System.out.println(sum);
    }

    //chuan hoa chuoi
    void f6() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                s = replaceIndex(s, "", i);
                i--;
            }
        }
        System.out.println(s);
    }

    //day la cach thu 2 bai chuan hoa chuoi
    void f61() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.trim();
        // "\\s+" mang y nghia la nhieu hon 1 dau cach
        s = s.replaceAll("\\s+", " ");
        System.out.println(s);
    }

    //chen vao vi tri index
    String insert(String s, String replace, int index) {
        String[] array = new String[2];
        array[0] = s.substring(0, index);
        array[1] = s.substring(index);
        return array[0] + replace + array[1];
    }

    //chen vao tai vi tri chia het cho 3 ky tu: - (bai nay lay diem 10 thi phai neu anh nho khong nham)
    void f7() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for (int i = 3; i < s.length(); i += 4) {
            s = insert(s, "-", i);
        }
        System.out.println(s);
    }

    void f8() {
        System.out.println("Enter String: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        String[] censored = {"fuck", "shit", "hell", "damn"};
        String[] words = word.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < censored.length; j++) {
                if (words[i].compareTo(censored[j]) == 0) {
                    words[i] = censored[j].charAt(0) + "";
                    for (int k = 0; k < censored[j].length() - 1; k++) {
                        words[i] = words[i] + "*";
                    }
                    break;
                }
            }
        }
        word = "";
        for (String s : words) {
            word += " " + s;
        }
        word = word.trim();
        System.out.println(word);
    }

}

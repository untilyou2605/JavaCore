/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anhnb
 */
public class test {

    //anhiu
    static String insert(String s, String replace, int index) {
        String[] array = new String[2];
        array[0] = s.substring(0, index);
        array[1] = s.substring(index+1);
        return array[0] + replace + array[1];
    }
    
    static String replaceIndex(String s, String replace, int index) {
        String[] array = new String[2];
        array[0] = s.substring(0, index);
        array[1] = s.substring(index + 1);
        return array[0] + replace + array[1];
    }

    public static void main(String[] args) {
        String s = "xxszwedsc    sc  dvd dsvs sc";
        int len = s.length();
        int count = 0;

//        for (int i = 3; i < s.length(); i += 4) {
//            s = insert(s, "-", i);
//        }
//         System.out.println(s);
//         
//          s=s.trim();
//        for(int i =0;i<s.length();i++){
//            if(s.charAt(i)==' '&&s.charAt(i+1)==' '){
//                s= replaceIndex(s, "", i);
//            }
//            
//        }
        s=s.replaceAll("\\s+", " ");
        System.out.println(s);
    }
}

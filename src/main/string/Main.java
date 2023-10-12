package main.string;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        char a = 'a';
//        String k="mama";
//        char[] w = k.toCharArray();
//        System.out.println(Character.isAlphabetic(a));
//        System.out.println(Character.isDigit(a));
//        System.out.println(Arrays.toString(w));
//        String s = "Welcome to Java";
//        String m = "welcome to Java";
//        System.out.println(s.length());
//        System.out.println(s.charAt(3));
//        System.out.println(s.codePointAt(3));
//        if(s.toLowerCase().equals(m.toLowerCase())){
//            System.out.println(true);
//        }else System.out.println(false);
//        System.out.println(s.compareTo(m));
//        System.out.println(s.startsWith("Wel"));
//        System.out.println(s.endsWith("ava"));
//        System.out.println(m.indexOf('a'));
//        System.out.println(m.lastIndexOf('a'));
//        int sum = sum(5);
//        System.out.println(sum);
//        int fact = factorial(5);
//        System.out.println(fact);
//        String s = reverse("miamore");
//        System.out.println(s);
//        boolean d = isPalendrom("asdfgfdsa");
//        System.out.println(d);
//        System.out.println(k.charAt(k.length()-1));
//        System.out.println(fibo(8));
//        combine("ADS", 4, "");
        String s = "ABC";
        boolean[] visited = new boolean[s.length()];
        rec(s,visited,"");
    }

    public static int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }
    public static int factorial(int n){
        if(n==1)return 1;
        return n*factorial(n-1 );
    }
    public static String reverse(String s){
        if(s.length()==1)return s;
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
    private static boolean isPalendrom(String a){
        if(a.length()==1 || a.isEmpty()){
            return true;
        }
        if(a.charAt(0)==a.charAt(a.length()-1))
            return isPalendrom(a.substring(1,a.length()-1));
        return false;
    }
    public static int fibo(int n){
        if(n==1 || n ==0) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void combine(String s, int n, String cur){
        if(cur.length()==n){
            System.out.println(cur);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            combine(s, n, cur + s.charAt(i));
        }
    }
    public static void rec(String s, boolean[] visited, String curr){
        if(s.length() == curr.length()){
            System.out.println(curr);
            return;}
        for (int i = 0; i < s.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                rec(s,visited, curr+s.charAt(i));
                visited[i] = false;
            }
        }

    }
}

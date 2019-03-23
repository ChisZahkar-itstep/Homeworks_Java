package StringToCorrect;

public class StringToCorrect {
    static String s = "Предложение  один     Теперь предложение    два   Предложение   три   Предложение теперь  четыре";
    static String s1 = s.replaceAll(" +", " ");
    static StringBuilder s2 = new StringBuilder(s1);
    static String s3 = "";
    static int count = 0;
    public static void main(String[] args) {
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
                s2.setCharAt(i - 1, '.');
                write(i);
                s3 = s3 + " ";

            }
            if(i == s1.length() - 1){
                write(i);
                s3 = s3 + ".";
            }
        }
        System.out.println(s3);
    }
    static void write(int i){
        for(int j = count; j < i; ++j){
            ++count;
            s3 = s3 + s2.charAt(j);
        }
        if(i == s1.length() - 1){
            for(int j = count; j <= i; ++j){
                ++count;
                s3 = s3 + s2.charAt(j);
            }
        }
    }
}
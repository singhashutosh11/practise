package Java.programs;

public class StringCompression {

    public static void main(String[] args) {

        String x="AABCCCDEF";
        String comPress=stringCompression(x);
        System.out.println(comPress);
    }

    public static String stringCompression(String str){
        String s="";
        char[] strChar=str.toCharArray();
        if(strChar.length==1){
            return str;
        }

        if(strChar.length==2){
            if(strChar[0]==strChar[1]){
                return strChar[0]+"2";
            }else{
                return str;
            }
        }

        for(int i=0;i<str.length();i++){
            int c=i+1;
            while(c<str.length() && str.charAt(i)==str.charAt(c)){
                c++;
            }
            if(c-i!=1){
               str=str.substring(0,i+1)+String.valueOf(c-i)+str.substring(c);
               i++;
            }else{
                str=str.substring(0,i+1)+String.valueOf(c-i)+str.substring(c);
                i++;
            }
        }
        return str;
    }
}

package Java.programs;

public class revrseStringUsingRecursive {

    String rev="";
    public static void main(String[] args) {

        String str="Ashutosh";
        revrseStringUsingRecursive rs=new revrseStringUsingRecursive();
      //  System.out.println(rs.reverseRecursive(str));
        rs.reverseString(str);

    }

    public String reverseRecursive(String str){

        if(str.length()==1){
            return str;
        } else {
            rev+=str.charAt(str.length()-1)+reverseRecursive(str.substring(0,str.length()-1));
            return rev;
        }
    }

    public void reverseString(String str){
        int i=str.length();
        while(i>0){

            rev+=str.charAt(i-1);
            i--;
        }
        System.out.println(rev);
    }



}

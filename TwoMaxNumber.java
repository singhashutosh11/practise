package Java.programs;

public class TwoMaxNumber {

    public static void main(String[] args) {

        int [] x={3,6,1,5,4,9,2};
        twoMaxNumber(x);
    }

    private static void twoMaxNumber(int[] x){

        int fMax=0;
        int sMax=0;
        int i=0;
        while(i<x.length){

            if(x[i]>fMax){
                sMax=fMax;
                fMax=x[i];
                i++;

            }else if(x[i]>sMax) {
                sMax=x[i];
                i++;
            }else {
                i++;
            }
        }
        System.out.println(fMax);
        System.out.println(sMax);
    }
}

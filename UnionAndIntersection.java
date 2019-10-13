package Java.programs;


//Write a program to find common elements between two arrays.
public class UnionAndIntersection {

    public static void main(String[] args) {

        int [] num1={1,3,5,6,7};
        int [] num2={2,4,5,6,9};
        int [] num3={5,6,7,9};

        UnionAndIntersection UnIt=new UnionAndIntersection();
       // UnIt.unionOfTwoArrays(num1,num2);
       // UnIt.intersctionOfTwoArrays(num1,num2);
        UnIt.intersctionOfThreeArrays(num1,num2,num3);

    }

    public void unionOfTwoArrays(int[] num1, int[] num2){
        int i=0,j=0;
        while (i<num1.length && j<num2.length){

            if(num1[i]>num2[j]){
                System.out.println(num2[j]);
                j++;
            }else if (num1[i]<num2[j]){
                System.out.println(num1[i]);
                i++;
            }else {
                System.out.println(num2[j]);
                i++;
                j++;
            }
        }

    }

    public void intersctionOfTwoArrays(int[] num1, int[] num2){
        int i=0,j=0;
        while (i<num1.length && j<num2.length){

            if(num1[i]>num2[j]){
                j++;
            }else if (num1[i]<num2[j]){
                i++;
            }else {
                System.out.println(num2[j]);
                i++;
                j++;
            }
        }

    }

    public void intersctionOfThreeArrays(int[] num1, int[] num2,int[] num3){
        int i=0,j=0,k=0;

        while (i<num1.length && j<num2.length && k<num3.length){

            if(num1[i]==num2[j] && num2[j]==num3[k]){
                System.out.println(num1[i]);
                i++;j++;k++;

            }else if(num1[i]>num2[j]){
                j++;
            }else if (num2[j]>num3[k]){
                k++;
            }else
                i++;
        }

    }
}

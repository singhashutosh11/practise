package Java.programs;

// Java program to print a given matrix in spiral form
public class printSpiral {

    public static void main(String[] args) {

        int R = 3;
        int C = 6;
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                     { 7, 8, 9, 10, 11, 12 },
                   { 13, 14, 15, 16, 17, 18 },
                   { 19, 20, 21, 22, 23, 23 } };
        spiralPrint(4, 6, a);
        System.out.println();
        spiralPrintRecursive(0,0,4,6,a);
    }

    private static void spiralPrint(int r, int c, int[][] a) {
        int rowStartIndex=0;
        int colStartInddex=0;
        int rowEndIndex=r;
        int colEndIndex=c;
        int i;

        while(rowStartIndex<rowEndIndex && colStartInddex<colEndIndex){

            //print first row

            for(i=colStartInddex;i<colEndIndex;i++){
                System.out.print(a[rowStartIndex][i]+" ");
            }
            rowStartIndex++;

            //print last column
            for(i=rowStartIndex;i<rowEndIndex;i++){
                System.out.print(a[i][colEndIndex-1]+" ");
            }
            colEndIndex--;

            // print the last row from remaining rows
           if(rowStartIndex<rowEndIndex){
               for(i=colEndIndex-1;i>=colStartInddex;i--){
                   System.out.print(a[rowEndIndex-1][i]+" ");
               }
               rowEndIndex--;
           }

           // print the first column from remaining columns

            if(colStartInddex<colEndIndex){
                for(i=rowEndIndex-1;i>=rowStartIndex;i--){
                    System.out.print(a[i][colStartInddex]+" ");
                }
                colStartInddex++;
            }


        }

    }

    private static void spiralPrintRecursive(int rS, int cS, int rE, int cE,int [][]arr){

        if(rS>=rE || cS>=cE){
            return;
        }

        // print first row

        for(int i=cS; i<cE;i++){
            System.out.print(arr[rS][i]+" ");
        }
        rS++;

        //print last column

        for(int i=rS;i<rE;i++){
            System.out.print(arr[i][cE-1]+" ");
        }
        cE--;

        //print last row if row is not the first row

        if(rE>rS){

            for (int i=cE-1;i>=cS;i--){
                System.out.print(arr[rE-1][i]+" ");
            }
            rE--;
        }

        //print first colum if first and last column is not same

        if(cE>cS){

            for(int i=rE-1;i>=rS;i--){
                System.out.print(arr[i][cS]+" ");
            }
            cS++;
        }

        spiralPrintRecursive(rS,cS,rE,cE,arr);

    }
}

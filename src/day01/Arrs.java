package day01;
public class Arrs {
    public static void main(String[] args) {

        Integer[] mat = new Integer[6];
        //Size of array
        System.out.printf("size of mat: %d",mat.length);
        

        mat[0]= 0;
        mat[1]= 1;
        mat[2]= 2;
        mat[3]= 3;
        mat[4]= 4;
        mat[5]= 5;
        System.out.println(">>>>mat "+ mat);
Integer i = 0;
        for (i=0;i <mat.length; i++){
            System.out.printf("for-loop:%d\n",mat[i]);
        }
    }
}

import java.util.Arrays;
public class ArraysManipulacao {
    public static void main(String[] args) {
        int [] Number = {0,3,2,1,4,6,9,8,32,12,454,4667,1223,2,-4,23,42,2,1,23,4,5,6,-123,42,45,11,244,5,6,7,8,999,0,6786,68,456,4-546456,435646,322,-234,23,-555};
        Arrays.sort(Number);

        System.out.println(Number[0] + " e " + Number[Number.length - 1]);
    }
}

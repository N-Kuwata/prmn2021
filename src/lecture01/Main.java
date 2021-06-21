package lecture01;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100]; //int型の配列を100要素
        for(int i=0; i<array.length; i++){
            System.out.println("array[" +i+ "]=" +(i+1));
        }
        int sum =0;
        for(int i=2;i<=array.length;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum=" +sum);
    }
}
package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> DiceList = new ArrayList<>();
        Random random = new Random();
        DiceList.add(random.nextInt(6) + 1); //0~5に+1して1~6にする
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);

        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？(0～4を入力)");
        try {
            int index = scanner.nextInt();
            System.out.println(index + "番目は" + DiceList.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。\nプログラムを終了します。");
        }
        catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。\nプログラムを終了します。");
        }
    }
}

package lecture07;

public class Monster {
    private String name;
    private int hitpoint, attack, block, speed;
    private List<Move> moveList;

    public (String name, int hitpoint, int attack, int block, int speed){
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
        this.moveList = new ArrayList<>();

        System.out.println(this.name + "を選択しました");
    }
}

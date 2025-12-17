package progate.practice;

public class Vehicle {
    private String name;
    private String color;
    private int x = 0;             // 現在地
    private int velocity = 0;      // 速度
    private Person owner;
    private int distance = 0;

    // コンストラクタ
    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 情報を出力
    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("現在地：" + this.x + "km");
        System.out.println("速度：" + this.velocity + "km/h");
    }

    // 前進
    public void go(int time) {
        int distance = this.velocity * time;
        this.x += distance;
        System.out.println(distance + "km進みました");
        System.out.println("現在地：" + this.x + "km");
    }

    // 後退
    public void back(int time) {
        int distance = this.velocity * time;
        this.x -= distance;
        System.out.println(distance + "km戻りました");
        System.out.println("現在地：" + this.x + "km");
    }

    // 2つのVehicleの現在地の差を計算
    public static int diff(Vehicle x1, Vehicle x2) {
        return Math.abs(x1.getX() - x2.getX());
    }

    // getter / setter
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getVelocity() {
        return this.velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}

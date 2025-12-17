package progate.practice;

class Bicycle extends Vehicle {
    Bicycle(String name, String color) {
        super(name, color);
    }

    // 前進
    public void go(int time) {
        int distance = this.getVelocity() * time;
        this.setX(this.getX() + distance); // 現在地を更新
        System.out.println(distance + "km進みました");
        System.out.println("現在地：" + this.getX() + "km");
    }

    // 後退
    public void back(int time) {
        int distance = this.getVelocity() * time;
        this.setX(this.getX() - distance); // 現在地を減少
        System.out.println(distance + "km戻りました");
        System.out.println("現在地：" + this.getX() + "km");
    }
}

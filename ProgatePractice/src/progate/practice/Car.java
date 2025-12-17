package progate.practice;

class Car extends Vehicle {
    private int fuel = 50;

    Car(String name, String color) {
        super(name, color);
    }

    public int getFuel() {
        return this.fuel;
    }

    // printDataはVehicleの情報に加えてガソリン量を表示
    public void printData() {
        super.printData();
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    // 前進(go)に対応
    public void go(int time) {
        int distance = this.getVelocity() * time;

        if (distance <= this.fuel) {
            this.setX(this.getX() + distance); // 現在地を更新
            this.fuel -= distance;
            System.out.println(distance + "km進みました");
        } else {
            System.out.println("ガソリンが足りません");
            // 走れる距離だけ進む
            this.setX(this.getX() + this.fuel);
            System.out.println(this.fuel + "kmだけ進みました");
            this.fuel = 0;
        }

        System.out.println("現在地：" + this.getX() + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    // 後退(back)に対応
    public void back(int time) {
        int distance = this.getVelocity() * time;

        if (distance <= this.fuel) {
            this.setX(this.getX() - distance); // 現在地を減らす
            this.fuel -= distance;
            System.out.println(distance + "km戻りました");
        } else {
            System.out.println("ガソリンが足りません");
            this.setX(this.getX() - this.fuel);
            System.out.println(this.fuel + "kmだけ戻りました");
            this.fuel = 0;
        }

        System.out.println("現在地：" + this.getX() + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void charge(int litre) {
        System.out.println(litre + "L給油します");
        if (litre <= 0) {
            System.out.println("給油できません");
        } else if (litre + this.fuel >= 100) {
            System.out.println("満タンまで給油します");
            this.fuel = 100;
        } else {
            this.fuel += litre;
        }
        System.out.println("ガソリン量：" + this.fuel + "L");
    }
}

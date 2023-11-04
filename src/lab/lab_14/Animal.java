package lab.lab_14;

public abstract class Animal {
    /*
     /*Trong 1 khu rừng nọ, vào mua Thu hằng năm đều tổ chức 1 cuộc đua thú.
    Chỉ có những động vật 4 chân mới có thể tham gia cuộc đua này.
    Mỗi con vật sẽ có tốc độ chạy ngẫu nhiên và khác nhau.
    Năm nay có 3 giống loài được tham gia cuộc đua là Tiger, Elephant và Horse.
    Trong quá trình cuộc thi được tổ chức, sẽ có 1 phần thi dành cho khán giả, khán giả sẽ đoán xem loài nào sẽ là quán quân năm nay.
    Là một lập trình viên, bạn hãy thiết kế 1 chương trình giả lập cuộc đua để đoán xem loài nào sẽ vô địch năm nay.
    Tốc độ (m/s) của các loài vật được mô tả bên dưới.



    - Horse: Tốc độ của ngựa dao động từ 15-24m/s.
    Mỗi cuộc đua, mỗi loài sẽ cử 2 đại diện tham gia, các con vật sẽ chạy cùng lúc và cùng 1 điểm xuất phát,
    độ dài đường đua là 10km, chỉ cần 1 con của loài dành chiến thắng thì cả loài sẽ thắng.
    Để tăng khả năng chính xác, chương trình của bạn sẽ phải chạy giả lập nhiều lần để kết quả gần đúng nhất.
    Do đó tính năng giả lập cuộc sẽ phải chạy ít nhất 10 lần và loài nào có số lần thắng nhiều nhất sẽ là loài được chọn.
     */

    protected int quantityLegs;
    protected String name;
    protected String type;
    protected double speed;
    protected RacingBehaviour racingBehaviour;

    public int getQuantityLegs() {
        return quantityLegs;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = this.getRacingBehaviour().getRacingSpeed();
    }

    public void setQuantityLegs(int quantityLegs) {
        this.quantityLegs = quantityLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RacingBehaviour getRacingBehaviour() {
        return racingBehaviour;
    }

    public void setRacingBehaviour(RacingBehaviour racingBehaviour) {
        this.racingBehaviour = racingBehaviour;
    }
}

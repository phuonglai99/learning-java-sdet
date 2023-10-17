package lab.lab_09;

import java.security.SecureRandom;

public class AnimalBuilder {
    private int speed;
    private String name;
    private boolean withSwings;
    protected AnimalBuilder(Builder builder){
        this.speed = builder.speed;
        this.name = builder.name;
        this.withSwings = builder.withSwings;
    }
    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public boolean isWithSwings() {
        return withSwings;
    }

    public static class Builder{
        private int speed;
        private String name;
        private boolean withSwings;

        public Builder setRandomWithMaxSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWithSwings(boolean withSwings) {
            this.withSwings = withSwings;
            return this;
        }

        public AnimalBuilder build(){
            return new AnimalBuilder(this);
        }
    }
}

package lesson.lesson_09;

public class HouseWithBuilder {
    private String color;
    private  int mainDoors;
    private  int windows;
    private String roofTopColor ;
    protected  HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.mainDoors = builder.mainDoors;
        this.windows = builder.windows;
        this.roofTopColor = builder.roofTopColor;
    }
// read only
    public String getColor() {
        return color;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    public int getWindows() {
        return windows;
    }

    public String getRoofTopColor() {
        return roofTopColor;
    }
//chaning method
    public static class Builder{
        private String color;
        private  int mainDoors;
        private  int windows;
        private String roofTopColor ;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setRoofTopColor(String roofTopColor) {
            this.roofTopColor = roofTopColor;
            return this;
        }
        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}

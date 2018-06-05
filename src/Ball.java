public class Ball { // model - blueprint

    // xususiyatlari - properties and instant variables

    //Access modifiers
    //public - bu method bn barcha class barcha tomondan kirish mumkin
    //public - anyone can access

    //private - only accessed within the class
    //private - faqatgina shu klass ichida ishlaydi


    private String color; // rangi
    private String name; // nomi
    private int capacity; // og'irligi

    public void bouncing(){
        System.out.println("Ball is bouncing");
    }

    //Constructor

    public Ball(){

    }

    public Ball(String mColor, String mName, int mCapacity) {
        this.color = mColor;
        this.name = mName;
        this.capacity = mCapacity;
        //this - bu indicator
    }

    public Ball(String bColor, int bCapacity){
        this.color = bColor;
        this.capacity = bCapacity;
    }

    public void showColor(){
        System.out.println(color);
    }

    //Getter and Setter


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
